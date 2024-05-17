package com.tw_Internship.in;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        final int MIN_NUMBER = 1;
        final int MAX_NUMBER = 100;
        final int MAX_ATTEMPTS = 5;
        int randomNumber = random.nextInt(MAX_NUMBER) + MIN_NUMBER;
        int attempts = 0;

        System.out.println("Welcome to Guess Number Game ");
        System.out.println("Enter Guess a number in between " + MIN_NUMBER + " and " + MAX_NUMBER + ".");
        System.out.println("You have " + MAX_ATTEMPTS + " attempts to guess it.");

        while (attempts < MAX_ATTEMPTS) {
            System.out.println("Attempt #" + (attempts + 1) + " Enter a Guess number in between " + MIN_NUMBER + " and "
                    + MAX_NUMBER + ".");
            int guess = scanner.nextInt();

            if (guess < MIN_NUMBER || guess > MAX_NUMBER) {
                System.out.println("Please enter a number between " + MIN_NUMBER + " and " + MAX_NUMBER + ".");
                continue;
            }
            attempts++;

            if (guess > randomNumber) {
                System.out.println("Your Guess Number is greater.");
            } else if (guess < randomNumber) {
                System.out.println("Your Guess Number is smaller.");
            } else {
                System.out.println("OOhhOO! Your Number is Correct You Win the Game! " + randomNumber);
                System.out.println("You guessed it in " + attempts + " attempts.");
                return;
            }
        }
        System.out.println("Sorry, you've run out of attempts. The correct number was: " + randomNumber);
        scanner.close();
    }
}

