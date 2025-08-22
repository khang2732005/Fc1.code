package Lec5_LoopExercise;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int N = sc.nextInt();
        long factorial = 1;
        for (int i = N; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println("The factorial of " + N + " is: " + factorial);
    }
}
