package com.example;

public class App {
    public static String greeting(String name) {
        return "Welcome to Maven, " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println(greeting("Prem"));
        System.out.println("Java + Maven + Jenkins CI/CD");
    }
}
