package com.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateExample {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
        String dateInString = "15-Sep-2022";
        try {
            Date d = formatter.parse(dateInString);
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
