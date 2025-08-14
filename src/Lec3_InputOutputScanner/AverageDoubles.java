package Lec3_InputOutputScanner;

import java.util.Scanner;

public class AverageDoubles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double average = (num1 + num2) / 2; // Tính trung bình
        System.out.println("The average is: " + average);
    }
}
