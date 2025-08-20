package Lec4_ConditionalExpression;

import java.util.Scanner;

public class TriangleClassifier {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three side lengths: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("This is an equilateral triangle.");
            } else if (a == b || b == c || a == c) {
                System.out.println("This is an isosceles triangle.");
            } else {
                System.out.println("This is a scalene triangle.");
            }
        } else {
            System.out.println("These sides cannot form a triangle.");
        }
    }
}
