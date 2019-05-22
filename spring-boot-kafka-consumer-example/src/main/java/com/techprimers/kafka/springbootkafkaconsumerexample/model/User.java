package com.techprimers.kafka.springbootkafkaconsumerexample.model;

public class User {
    private String name;
    private String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public User() {
    }

    public User(String name, String department) {
        this.name = name;
        this.department = department;
    }
}
