package Lec3_InputOutputScanner;

import java.util.Scanner;

public class ReadBoolean {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a boolean value (true/false): ");
        boolean value = scanner.nextBoolean(); 
        if (value) {
            System.out.println("You entered true.");
        } else {
            System.out.println("You entered false.");
        }
    }
}


