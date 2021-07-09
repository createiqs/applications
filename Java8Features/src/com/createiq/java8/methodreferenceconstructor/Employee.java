package com.createiq.java8.methodreferenceconstructor;
public class Employee {
    private String name;

    Employee() {
        System.out.println("Empty Constructor");
    }

    Employee(String name) {
        System.out.println("Name Constructor");
        this.name = name;
    }

    public String toString() {
        return "name: " + name;
    }
}