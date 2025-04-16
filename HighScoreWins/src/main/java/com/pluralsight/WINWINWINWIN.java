package com.pluralsight;
import java.util.Scanner;
import java.util.Date;
// import java.util.;

public class WINWINWINWIN {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What was the game score? (ex. format: 'Home:Visitor|21:9') " );
        String userInput = keyboard.nextLine().trim();

        // Separator Indexes
        int colonOne = userInput.indexOf(":");
        int delimiter = userInput.indexOf("|");
        int colonTwo = userInput.lastIndexOf(":");

        // Extraction of teams and scores w/ substring
        String team1 = userInput.substring(0, colonOne);
        String team2 = userInput.substring(colonOne + 1, delimiter);
        String strScore1 = userInput.substring(delimiter + 1, colonTwo);
        String strScore2 = userInput.substring(colonTwo +1);

        // Parsing the scores
        int score1 = Integer.parseInt(strScore1);
        int score2 = Integer.parseInt(strScore2);

        // How we find the winner
        String winner = "";
        if (score1 > score2){
            winner = team1;
        } else if (score1 == score2){
            System.out.println("It's a TIE!");
        } else {
            winner = team2;
        }

        System.out.println("Winner: " + winner);
    }
}
