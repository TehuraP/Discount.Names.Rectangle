package com.company;

public class Names {
    public static void main(String[] args) {
        String firstName = "Tehura";
                String lastName = "Pardo";

        System.out.println(firstName + " " + lastName );

        System.out.println( makeFullName(firstName, lastName));
        System.out.println(makeFullName("Grace", "Hopper"));


    }
    public static String makeFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }   //This is the Method, wir lagern die Funktionalität damit

}
