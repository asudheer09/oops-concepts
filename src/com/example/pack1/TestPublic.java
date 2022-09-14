package com.example.pack1;

public class TestPublic {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.i);
       // System.out.println(a.j); //compile time error because j is private
        System.out.println(a.k);
        System.out.println(a.l);
    }
}
