package Lec5_LoopExercise;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        int height = sc.nextInt();
        System.out.print("Enter width: ");
        int width = sc.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
