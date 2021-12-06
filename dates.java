package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        String date;
        System.out.println("Enter the date: ");
        Scanner scanner = new Scanner(System.in);
        date = scanner.next();
        scanner.close();
        if (date.matches("(3[01])/(0?[2]/([1-9]\\d\\d\\d))")){
            System.out.println("Invalid data. There's no 30th/31st of February");
            return;
        }
        if (dateCheck(date)) {
            System.out.println("Your date is valid.");
        } else {
            System.out.println("Invalid data. Try and enter a proper date.");
        }
    }

    public static boolean dateCheck(String s) {
        return s.matches("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[1-9])/([1-9]\\d\\d\\d)");
    }
}