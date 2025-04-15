package com.pluralsight;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        //calling scanner
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = keyboard.nextLine().trim();
        System.out.print("Enter your middle name: ");
        String midName = keyboard.nextLine().trim();
        System.out.print("Enter your last name: ");
        String lastName = keyboard.nextLine().trim();
        System.out.print("Enter a suffix if any apply: ");
        String suffy = keyboard.nextLine().trim();

        String fullName;

        // checking for middle name
        if (!midName.equals("")) {
            fullName = firstName + " " + midName + " " + lastName;
        } else {
            fullName = firstName + " " + lastName;
        }

        // checking for suffix
        if (!suffy.equals("")){
            fullName = fullName + ", " + suffy;
        }

        System.out.println("Full Name: " + fullName);
    }
}
