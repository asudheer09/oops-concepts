package com.example.pack1;

public class A {
    public int i=10;
    private int j=20;

    int k=30;
    protected int l=40;

    public static void main(String[] args) {
        A a= new A();
        System.out.println(a.i);
        System.out.println(a.j);
        System.out.println(a.k);
        System.out.println(a.l);
    }
}
