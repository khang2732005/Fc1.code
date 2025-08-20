package Lec4_ConditionalExpression;

import java.util.Scanner;

public class QuadraticSolver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coefficients a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a == 0) {
            if (b != 0) {
                double x = -c / b;
                System.out.println("This is a linear equation. The root is x = " + x);
            } else {
                System.out.println("Invalid equation.");
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("The equation has no real roots.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("The equation has a double root: x1 = x2 = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("The equation has two distinct roots: x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }
}
