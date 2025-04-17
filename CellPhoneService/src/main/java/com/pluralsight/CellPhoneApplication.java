package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // CellPhone
        // create first instance of CellPhone
        CellPhone phone1 = new CellPhone();

        // gather input from user for phone1
        System.out.print("Enter info for Phone #1\n");

        System.out.print("What is the serial number? ");
        double serialNumber1 = keyboard.nextDouble();
        keyboard.nextLine(); // clear newline after nextDouble()

        System.out.print("What model is the phone? ");
        String model1 = keyboard.nextLine();

        System.out.print("Who is the carrier? ");
        String carrier1 = keyboard.nextLine();

        System.out.print("What is the phone number? ");
        String phoneNumber1 = keyboard.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String owner1 = keyboard.nextLine(); // allows full name with spaces

        // setter assignment for phone1
        phone1.setSerialNumber(serialNumber1);
        phone1.setModel(model1);
        phone1.setCarrier(carrier1);
        phone1.setPhoneNumber(phoneNumber1);
        phone1.setOwner(owner1);

        // create second instance of CellPhone
        CellPhone phone2 = new CellPhone();

        // gather input from user for phone2
        System.out.print("\nEnter info for Phone #2\n");

        System.out.print("What is the serial number? ");
        double serialNumber2 = keyboard.nextDouble();
        keyboard.nextLine(); // clear newline after nextDouble()

        System.out.print("What model is the phone? ");
        String model2 = keyboard.nextLine();

        System.out.print("Who is the carrier? ");
        String carrier2 = keyboard.nextLine();

        System.out.print("What is the phone number? ");
        String phoneNumber2 = keyboard.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String owner2 = keyboard.nextLine(); // allows full name with spaces

        // setters assignment for phone2
        phone2.setSerialNumber(serialNumber2);
        phone2.setModel(model2);
        phone2.setCarrier(carrier2);
        phone2.setPhoneNumber(phoneNumber2);
        phone2.setOwner(owner2);

        // displays both phones using display() method
        System.out.println("\n--- Phone Details ---\n");
        display(phone1);
        System.out.println(); // spacing between phones
        display(phone2);

        // Make phone1 call phone2
        System.out.println("\nDialing test...");
        phone1.dial(phone2.getPhoneNumber(), phone2.getOwner());

        // Make phone2 call phone 1
        System.out.println("\n Dialing test 2...");
        phone2.dial(phone1.getPhoneNumber(), phone1.getOwner());
    }

    // method to display CellPhone details
    public static void display(CellPhone phone) {
        System.out.println("Owner: " + phone.getOwner());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Serial Number: " + phone.getSerialNumber());
    }
}
