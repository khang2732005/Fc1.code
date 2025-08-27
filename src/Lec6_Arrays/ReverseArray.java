package Lec6_Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {11, 42, -5, 27, 0, 89};

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
