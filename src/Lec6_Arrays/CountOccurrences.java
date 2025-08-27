package Lec6_Arrays;

import java.util.Scanner;

public class CountOccurrences {

    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 5, 2, 5};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find: ");
        int x = sc.nextInt();

        int count = 0;
        for (int num : arr) {
            if (num == x) {
                count++;
            }
        }

        System.out.println("The number " + x + " appears " + count + " times.");
    }
}
