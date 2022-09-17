package com.example;

public class Employee {

    static {
        System.out.println("static block");
    }

    {
        System.out.println("instance block");
    }

    Employee() {
        System.out.println("default constructor");
    }

    public static void main(String[] args) {
        Employee e = new Employee();
    }
}
