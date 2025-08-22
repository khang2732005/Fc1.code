package Lec5_LoopExercise;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int secret = rand.nextInt(100) + 1;
        int guess;
        do {
            System.out.print("Your guess: ");
            guess = sc.nextInt();
            if (guess > secret) {
                System.out.println("Your number is higher than the secret number.");
            } else if (guess < secret) {
                System.out.println("Your number is lower than the secret number.");
            }
        } while (guess != secret);
        System.out.println("Congratulations! You guessed correctly!");
    }
}
