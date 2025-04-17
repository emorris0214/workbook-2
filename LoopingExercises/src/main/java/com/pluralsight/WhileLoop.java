package com.pluralsight;

public class WhileLoop {
    public static void main(String[] args) {
        String text = "I love java! ";
        int iteratons = 5;
        int counter = 1;

        while(counter <= iteratons) {
            System.out.println(text + counter++);
        }
    }
}
