package com.example;

public class Student extends Object{
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +"college ="+Student.college+
                '}';
    }

    private static String college="JNTU";


    public Student(int id, String name,String college) {
        this.id = id;
        this.name = name;
        this.college=college;
    }

    public static void main(String[] args) {
        int i=10;
        String st="hi";
        System.out.println(st);//hi
        System.out.println(i);//10

        Student s= new Student(123,"abc","NEC");
        Student s1= new Student(123,"abc","DEC");

        System.out.println(s); //com.example.Student@hexadecimal code
        System.out.println(s1); // com.example.Student@hexadecimal code

    }


}
