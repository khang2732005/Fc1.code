package Lec6_Array_ArrayList_Exercise;

public class ArrayConcatenator {

    public static int[] concatenateArrays(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        for (int i = 0; i < a1.length; i++) {
            result[i] = a1[i];
        }
        for (int i = 0; i < a2.length; i++) {
            result[a1.length + i] = a2[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 5, 6};

        int[] combined = concatenateArrays(a1, a2);

        System.out.print("Concatenated array: ");
        for (int num : combined) {
            System.out.print(num + " ");
        }
    }
}
