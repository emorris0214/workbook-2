package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        CellPhone phone = new CellPhone();

        /*
        What is the serial number? 2597153
        What model is the phone? iPhone 15 Pro Max
        Who is the carrier? Verizon
        What is the phone number? 888-555-1234
        Who is the owner of the phone? Sandra
        Use the setters of your CellPhone object to add the values entered by the user.
        Using the getters of the CellPhone print the properties of the phone to the
screen.

 */
        System.out.print("What is the serial number? ");
        double serialNumber = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.print("What model is the phone? ");
        String model = keyboard.nextLine();

        System.out.print("Who is your carrier? ");
        String carrier = keyboard.nextLine();

        System.out.print("What is the phone number? (format as 888-555-1234) ");
        String phoneNumber = keyboard.nextLine();

        System.out.println("Who is the owner of the phone? ");
        String owner = keyboard.nextLine();

        // setting assignment
        phone.setSerialNumber(serialNumber);
        phone.setModel(model);
        phone.setCarrier(carrier);
        phone.setPhoneNumber(phoneNumber);
        phone.setOwner(owner);

        // Output Display
        System.out.print("Celly Information:\n");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.print("Owner of Phone: " + phone.getOwner());

    }
}
