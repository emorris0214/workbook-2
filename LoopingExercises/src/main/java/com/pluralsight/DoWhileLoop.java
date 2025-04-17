package com.pluralsight;

public class DoWhileLoop {
    public static void main(String[] args) {
        String text = "I love java! ";
        int iterations = 5;
        int counter = 1;
        do {
            System.out.println(text + counter++);
        } while(counter <= iterations);
    }
}
