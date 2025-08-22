package Lec5_LoopExercise;

import java.util.Scanner;

public class SumToN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer N: ");
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("The sum of numbers from 1 to " + N + " is: " + sum);
    }
}
