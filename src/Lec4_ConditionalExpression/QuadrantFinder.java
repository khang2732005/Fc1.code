package Lec4_ConditionalExpression;

import java.util.Scanner;

public class QuadrantFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x coordinate: ");
        double x = sc.nextDouble();
        System.out.print("Enter y coordinate: ");
        double y = sc.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("The point is in the 1st quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("The point is in the 2nd quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("The point is in the 3rd quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("The point is in the 4th quadrant");
        } else {
            System.out.println("The point lies on an axis");
        }
    }
}
