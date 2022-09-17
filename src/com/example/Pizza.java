package com.example;

public class Pizza extends Object{
    private int size;
    private String flavours;
    private String topping;
    private String category;

    public Pizza() {
        this(10,"chicken","corn","non-veg");
        System.out.println("default consturctor");
    }

    public Pizza(int size, String flavours, String topping, String category) {
        System.out.println("parameterized consturctor");
        this.size = size;
        this.flavours = flavours;
        this.topping = topping;
        this.category = category;
    }

    public Pizza(String flavours, String topping, String category) {
        this.flavours = flavours;
        this.topping = topping;
        this.category = category;
    }

    public Pizza(String topping, String category) {
        this.topping = topping;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", flavours='" + flavours + '\'' +
                ", topping='" + topping + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Pizza pizza=new Pizza();
       // Pizza pizza1=new Pizza("cheese","non-veg");
        System.out.println(pizza);

    }


}
