package Lec5_LoopExercise;

import java.util.Random;

public class RollDoubles {

    public static void main(String[] args) {
        Random rand = new Random();
        int rollCount = 0;
        int die1, die2;
        do {
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;
            rollCount++;
            System.out.println("Roll" + rollCount + ":" + die1 + "and" + die2);
        } while (die1 != die2);
        System.out.println("You rolled double after" + rollCount + "tries!");
    }
}
