package com.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToStringExample {

    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
        Date date = new Date();
        String s = formatter.format(date);
        System.out.println("after date to String conversion " + s);
    }
}
