package com.example.rclack.model.day1112;

import java.util.ArrayList;
import java.util.List;

public class Manager {

    private String position;

    private String job;

    private List<Manager> managers = new ArrayList<>();

    private List<Employee> employees = new ArrayList<>();

    public Manager(String position, String job) {
        this.position = position;
        this.job = job;
    }

    public void addManager(Manager manager) {
        managers.add(manager);
    }

    public void removeManager(Manager manager) {
        managers.remove(manager);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void work() {
        System.out.println("我是" + position + ", 我正在" + job);
    }

    public void check() {
        work();
        for (Employee employee : employees) {
            employee.work();
        }
        for (Manager manager : managers) {
            manager.check();
        }
    }
}
