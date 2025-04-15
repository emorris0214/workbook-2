package com.pluralsight;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class TICKETRES {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Prompt user for full name
        System.out.print("Please enter your full name: ");
        String fullName = keyboard.nextLine().trim();

        // Prompt user for date of the show
        System.out.println("What is the date of the show? (format ex. MM/DD/YYYY) ");
        String dateOfShow = keyboard.nextLine().trim();

        // This is the part where we change the input format to what is needed
        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // here specifically, we are converting the date to the specified LocalDate format
        LocalDate date = LocalDate.parse(dateOfShow, inputFormat);
        String showDateFormatted = date.format(outputFormat);

        // Prompt user for amount of tickets needed
        System.out.println("How many tickets will you need? ");
        int ticketsNeeded = keyboard.nextInt();

        // Sifting first & last names
        int whitespaceIndex = fullName.indexOf(" ");
        String firstName = fullName.substring(0, whitespaceIndex);
        String lastName = fullName.substring(whitespaceIndex + 1); //+1 moves it to next index

        //Singular/Plural Ticket
        String ticketWord;
        if (ticketsNeeded == 1){
            ticketWord = "ticket";
        } else {
            ticketWord = "tickets";
        }

        System.out.println(ticketsNeeded + " " + ticketWord + " reserved for " + showDateFormatted + " " + "under " + lastName + ", " + firstName);
    }
}
