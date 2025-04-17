package com.pluralsight;

import java.util.Scanner;

public class APP {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // new object

        VideoGame game = new VideoGame();
        System.out.println("Welcome to Enoch's Video Game Emporium!\n");
        System.out.println("---You will need to inssrt the new video game---");
        System.out.println("\n");

        System.out.println("Please enter the name of your video game: ");
        game.setName(keyboard.nextLine());
        System.out.println("Please enter the type: ");
        game.setType(keyboard.nextLine());
        System.out.print("Please enter if it's preowned: ");
        game.setPreowned(Boolean.parseBoolean(keyboard.nextLine()));
        System.out.print("Please enter if it's digital: ");
        game.setDigital(Boolean.parseBoolean(keyboard.nextLine()));
        System.out.print("Please enter the price: ");
        game.setPrice(Double.parseDouble(keyboard.nextLine()));

        System.out.println(("Thanks, here is your game being inserted: "));
        System.out.printf("Name: %s, Type: %s, Price: $%.2f", game.getName(), game.getType(), game.getPrice());
    }

}
