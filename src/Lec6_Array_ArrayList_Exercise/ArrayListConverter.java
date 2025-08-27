package Lec6_Array_ArrayList_Exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListConverter {

    public static ArrayList<String> arrayToArrayList(String[] array) {
        ArrayList<String> list = new ArrayList<>();
        for (String item : array) {
            list.add(item);
        }
        return list;
    }

    public static String[] arrayListToArray(ArrayList<String> list) {
        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] namesArray = {"Ann", "Bob"};
        ArrayList<String> namesList = arrayToArrayList(namesArray);
        System.out.println("ArrayList: " + namesList);
        ArrayList<String> peopleList = new ArrayList<>();
        peopleList.add("Charles");
        peopleList.add("David");
        String[] peopleArray = arrayListToArray(peopleList);
        System.out.println("Array: " + Arrays.toString(peopleArray));
    }
}
