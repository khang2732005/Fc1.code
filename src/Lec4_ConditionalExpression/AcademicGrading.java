package Lec4_ConditionalExpression;

import java.util.Scanner;

public class AcademicGrading {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter average score (0–10): ");
        double score = sc.nextDouble();

        if (score >= 9.0 && score <= 10.0) {
            System.out.println("Excellent");
        } else if (score >= 8.0) {
            System.out.println("Good");
        } else if (score >= 6.5) {
            System.out.println("Fair");
        } else if (score >= 5.0) {
            System.out.println("Average");
        } else {
            System.out.println("Fail");
        }
    }
}
