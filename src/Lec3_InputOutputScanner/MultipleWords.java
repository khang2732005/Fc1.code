package Lec3_InputOutputScanner;

import java.util.Scanner;

public class MultipleWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter multiple words: ");
        while (scanner.hasNext()) {
            String word = scanner.next();
            System.out.println(word);
        }
    }
}
