package com.pluralsight;

public class APP {
    public static void main(String[] args) {
        // 1. Create instance of Dice and variables
        Dice dice = new Dice();
        int roll1, roll2;
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        // 2. Loop (iterate) 100x
        for (int i = 1; i <= 100; i++) {
            // 3. Roll the dice twice
            roll1 = dice.roll();
            roll2 = dice.roll();

            int sum = roll1 + roll2;

            // 4. Print the roll and sum
            System.out.println("Roll " + i + ": " + roll1 + " - " + roll2 + "  Sum: " + sum);

            // 5-8. Count specific sums
            if (sum == 2) twoCounter++;
            if (sum == 4) fourCounter++;
            if (sum == 6) sixCounter++;
            if (sum == 7) sevenCounter++;
        }

        // 9. Displaying the counters
        display(twoCounter, fourCounter, sixCounter, sevenCounter);
    }

    // Display() method for results
    public static void display(int two, int four, int six, int seven) {
        System.out.println("\n--- Summary ---");
        System.out.println("Number of times 2 was rolled: " + two);
        System.out.println("Number of times 4 was rolled: " + four);
        System.out.println("Number of times 6 was rolled: " + six);
        System.out.println("Number of times 7 was rolled: " + seven);
    }
}
