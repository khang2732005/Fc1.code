package Lec6_Arrays;

public class SecondLargestFinder {

    public static int findSecondLargest(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new RuntimeException("No second-largest element found (all elements may be equal).");
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 20, 15, 20};
        int secondLargest = findSecondLargest(numbers);
        System.out.println("The second-largest element is: " + secondLargest);
    }
}
