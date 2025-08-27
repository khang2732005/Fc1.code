package Lec6_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class UnlimitedDataEntry {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int input;

        System.out.println("Enter integers (type -1 to stop):");

        while (true) {
            input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            numbers.add(input);
        }

        // Display entered numbers
        System.out.println("Numbers entered: " + numbers);

        // Calculate and display the sum
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("The sum is: " + sum);

        scanner.close();
    }
}
