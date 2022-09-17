package com.example;

public class Person {
    private String firstname;
    private String lastname;
    private char gender;
    private int age;
    private double weight;

    public Person(String firstname, String lastname, char gender, int age, double weight) {
        this.firstname = firstname; //f
        this.lastname = lastname; // l
        this.gender = gender; // 'm'
        this.age = age; //26
        this.weight = weight; //65.48
    }
    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        Person person= new Person("f","l",'m',26,65.48);
        System.out.println(person);
    }
}
