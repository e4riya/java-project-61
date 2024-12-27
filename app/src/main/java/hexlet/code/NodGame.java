package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class NodGame {
    public static String[][] start(Scanner userInput) {
        String[][] qA = new String[3][2];
        Random randomizer = new Random();
        int numberA;
        int numberB;
        int answer;
        int cnt = 0;
        while (cnt <= 2) {
            numberA = randomizer.nextInt(1, 100);
            numberB = randomizer.nextInt(1, 100);
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
