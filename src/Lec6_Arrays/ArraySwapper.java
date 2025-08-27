package Lec6_Arrays;

public class ArraySwapper {

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        System.out.println("Original array:");
        printArray(numbers);

        swap(numbers, 0, 2);

        System.out.println("Array after swapping index 0 and 2:");
        printArray(numbers);
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
