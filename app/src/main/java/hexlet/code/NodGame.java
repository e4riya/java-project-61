package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class NodGame {
    private static final int MAX_NUMBER = 100;
    public static String[][] start(Scanner userInput) {
        System.out.println("Find the greatest common divisor of given numbers.");
        int cnt = 0;
        Random randomizer = new Random();
        int numberA;
        int numberB;
        int answer;
        String[][] qA = new String[Engine.NUMBER_OF_ROUNDS][2];
        while (cnt <= 2) {
            numberA = randomizer.nextInt(1, MAX_NUMBER);
            numberB = randomizer.nextInt(1, MAX_NUMBER);
            if (nod(numberA, numberB) == 1) {
                continue;
            }
            answer = nod(numberA, numberB);
            qA[cnt][0] = numberA + " " + numberB;
            qA[cnt][1] = answer + "";
            cnt++;
        }
        return qA;

    }

    private static int nod(int a, int b) {
        if (a != 0 && b != 0) {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            return a;
        }
        return 0;
    }
}
