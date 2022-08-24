package com.example.rclack.spring2.day0210s.two;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {

    public static final String JDBC_URL = "jdbc:mysql://47.100.101.244:3306/rclack?characterEncoding=utf8";

    private static ThreadLocal<Connection> connectionThreadLocal = new ThreadLocal<>();

    public static Connection getConnection() {
        if (connectionThreadLocal.get() != null) {
            return connectionThreadLocal.get();
        }
        Connection connection;
        try {
            connection = DriverManager.getConnection(JDBC_URL, "root", "1133Lack");
            connectionThreadLocal.set(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public static void remove() {
        connectionThreadLocal.remove();
    }
}
