package Lec5_LoopExercise;

import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, count = 0, num;
        do {
            System.out.print("Enter a number (enter 0 to stop): ");
            num = sc.nextInt();
            if (num != 0) {
                sum += num;
                count++;
            }
        } while (num != 0);
        if (count > 0) {
            System.out.println("The average is: " + (double) sum / count);
        } else {
            System.out.println("No numbers entered.");
        }
    }
}
