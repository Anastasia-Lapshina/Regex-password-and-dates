package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        System.out.println("Enter your password: ");
        password = scanner.next();
        scanner.close();
        if (passwordCheck(password)) {
            System.out.println("Your password is valid.");
        } else {
            System.out.println("Your password is invalid. Try again");
        }

    }

    public static boolean passwordCheck(String s) {
        return s.matches("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=[_]*).{8,}");
    }
}
