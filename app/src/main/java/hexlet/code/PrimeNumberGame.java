package hexlet.code;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PrimeNumberGame {
    private static final int[] PRIME_NUMS = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
                                     43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
    private static final int MAX_NUMBER = 100;

    public static String[][] start(Scanner userInput) {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int cnt = 0;
        Random randomizer = new Random();
        int number;
        String answer;
        String[][] qA = new String[Engine.NUMBER_OF_ROUNDS][2];
        while (cnt <= 2) {
            number = randomizer.nextInt(0, MAX_NUMBER);
            if (Arrays.binarySearch(PRIME_NUMS, number) >= 0) {
                answer = "yes";
            } else {
                answer = "no";
            }
            qA[cnt][0] = number + "";
            qA[cnt][1] = answer;
            cnt++;
        }
        return qA;
    }
}
