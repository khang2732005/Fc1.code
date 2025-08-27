package Lec6_Arrays;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> inputList) {
        ArrayList<Integer> resultList = new ArrayList<>();

        for (Integer number : inputList) {
            if (!resultList.contains(number)) {
                resultList.add(number);
            }
        }

        return resultList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(3);
        input.add(2);
        input.add(1);
        input.add(4);
        input.add(3);
        input.add(5);

        ArrayList<Integer> output = removeDuplicates(input);
        System.out.println("Original list: " + input);
        System.out.println("Without duplicates: " + output);
    }
}
