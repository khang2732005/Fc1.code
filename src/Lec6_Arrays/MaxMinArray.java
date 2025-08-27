/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec6_Arrays;

import java.util.Scanner;

public class MaxMinArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {12, 49, -2, 26, 5}; 

        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("The maximum value is: " + max);
        System.out.println("The minimum value is: " + min);
    }
}
