package Lec3_InputOutputScanner;

import java.util.Scanner;

public class FixNextIntAndNextLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        scanner.nextLine(); 

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.println("Number: " + number);
        System.out.println("Sentence: " + sentence);
    }
}
