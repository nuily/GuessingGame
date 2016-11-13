package nyc.c4q.huilin.negativeone;

import java.util.Random;

/**
 * Created by huilin on 11/13/16.
 */

/*
public class Main {
    private static int[] moneyBank = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        int arrayLength = moneyBank.length;
        int choice = computerChoice();
        int decision = binarySearch(arrayLength, choice);
        if (decision == -1) {
            System.out.println("The choice was " + choice + " but the array did not contain the target value.");
        } else {
            System.out.println("Choice: " + choice + "\n" +
                    "Index: " + decision + "\n" +
                    "Value: " + moneyBank[decision]);
        }


    }

    private static int computerChoice() {
        Random random = new Random();
        int index = random.nextInt(moneyBank.length);
        return moneyBank[index];
    }

    */
/*
     * Returns either the index of the location in the array,
     * or -1 if the array did not contain the targetValue
     *//*

    private static int binarySearch(int arrayLength, int target) {
        int max = arrayLength - 1;
        int min = 0;

        while (max > min) {
            int guess = (max - min) / 2;
            guess += min;
            if (target == moneyBank[guess]) {
                return guess;
            }

            if (target > moneyBank[guess]) {
                min = guess + 1;
            } else {
                max = guess - 1;
            }
        }
        return -1;
    }
}
*/


public class Computer {

    private int choice;

    private static int[] moneyBank = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//    private void check() {
//        int arrayLength = moneyBank.length;
//        int choice = computerChoice();
//        int decision = binarySearch(arrayLength, choice);
//        if (decision == -1) {
//            System.out.println("The choice was " + choice + " but the array did not contain the target value.");
//        } else {
//            System.out.println("Choice:" + choice + "\n" +
//                    "Index: " + decision + "\n" +
//                    "Value: " + moneyBank[decision]);
//        }
//
//
//    }


    public int computerChoice() {
        Random random = new Random();
        choice = random.nextInt(1000);
        return choice;
    }

    private int guessHigher() {
        choice++;

        return 0;

    }

    private int binarySearch(int arrayLength, int target) {
        int max = arrayLength - 1;
        int min = 0;

        while (max > min) {
            int guess = (max - min) / 2;
            guess += min;
            if (target == moneyBank[guess]) {
                return guess;
            }

            if (target > moneyBank[guess]) {
                min = guess + 1;
            } else {
                max = guess - 1;
            }
        }
        return -1;
    }
}

