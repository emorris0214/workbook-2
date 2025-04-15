package com.pluralsight;
import java.util.Scanner;
import java.util.regex.*; //think I did this right? who knows? first attempt?

public class APP {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your full name (no suffix): ");
        String fullName = keyboard.nextLine().trim();

        String[] nameParts = fullName.split(" ");

        String firstName = "";
        String midName = "(none)";
        String lastName = "";

        // checking the length (each word is an element) and calling for the index
        if (nameParts.length == 2) {
            firstName = nameParts[0];
            lastName = nameParts[1];
        } else if (nameParts.length == 3) {
            firstName = nameParts[0];
            midName = nameParts[1];
            lastName = nameParts[2];
        } else {
            System.out.println("Invalid input. Please enter a name with 2 or 3 parts.");
            return;
        }

        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + midName);
        System.out.println("Last Name: " + lastName);

    }
}
