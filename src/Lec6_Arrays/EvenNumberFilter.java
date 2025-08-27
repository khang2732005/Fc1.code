package Lec6_Arrays;

import java.util.ArrayList;

public class EvenNumberFilter {

    public static ArrayList<Integer> filterEvenNumbers(int[] numbers) {
        ArrayList<Integer> evenList = new ArrayList<>();

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenList.add(num);
            }
        }

        return evenList;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8};
        ArrayList<Integer> result = filterEvenNumbers(inputArray);

        System.out.println("Even numbers: " + result);
    }
}
