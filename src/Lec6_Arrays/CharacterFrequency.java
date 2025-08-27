package Lec6_Arrays;

import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] frequency = new int[26];

        System.out.print("Enter a string (lowercase letters only): ");
        String input = scanner.nextLine();
        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                frequency[c - 'a']++;
            }
        }
        System.out.println("Character frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                char letter = (char) (i + 'a');
                System.out.println(letter + ": " + frequency[i]);
            }
        }

        scanner.close();
    }
}
