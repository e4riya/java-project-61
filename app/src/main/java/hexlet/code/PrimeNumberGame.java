package hexlet.code;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PrimeNumberGame {
    private static int[] primeNum = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
                                     43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

    public static String[][] start(Scanner userInput) {
        String[][] qA = new String[3][2];
        Random randomizer = new Random();
        int number;
        String answer;
        int cnt = 0;
        while (cnt <= 2) {
            number = randomizer.nextInt(0, 100);
            if (Arrays.binarySearch(primeNum, number) >= 0) {
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
