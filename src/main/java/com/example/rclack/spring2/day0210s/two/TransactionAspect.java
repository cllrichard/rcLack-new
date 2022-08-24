package com.example.rclack.spring2.day0210s.two;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.sql.Connection;

@Component
@Aspect
public class TransactionAspect {

    @Around("@annotation(com.example.rclack.spring2.day0210s.two.Transactional)")
    public Object doWithTransaction(ProceedingJoinPoint joinPoint) throws Throwable {
        Connection connection = JdbcUtils.getConnection();
        connection.setAutoCommit(false);
        try {
            Object retval = joinPoint.proceed();
            connection.commit();
            return retval;
        } catch (Throwable throwable) {
            connection.rollback();
            throw throwable;
        }finally {
            JdbcUtils.remove();
        }
    }
}
