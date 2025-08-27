package Lec6_Arrays;

import java.util.ArrayList;

public class RemoveLargeValues {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(60);
        numbers.add(25);
        numbers.add(80);
        numbers.add(5);
        numbers.add(95);

        System.out.println("Original list: " + numbers);
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) > 50) {
                numbers.remove(i);
            }
        }

        System.out.println("Filtered list (<= 50): " + numbers);
    }
}
