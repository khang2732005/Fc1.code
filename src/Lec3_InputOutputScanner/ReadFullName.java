package Lec3_InputOutputScanner;

import java.util.Scanner;

public class ReadFullName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.println("Your name is: " + fullName);
    }
}
