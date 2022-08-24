package com.example.rclack.model.day1214.two;


public class Student {

    private String studentName;

    public int studentAge;

    public Student() {

    }

    private Student(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    private String show(String message) {
        System.out.println("show : " + studentName + ", " + studentName + "," + message);
        return "testReturnValue";
    }
}
