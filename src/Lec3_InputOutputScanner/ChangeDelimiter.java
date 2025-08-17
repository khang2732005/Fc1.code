package Lec3_InputOutputScanner;

import java.util.Scanner;

public class ChangeDelimiter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(",");

        System.out.print("Enter comma-separated numbers: ");
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("Number: " + number);
        }
    }
}
