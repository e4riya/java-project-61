package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class CalcGame {
    private static final String[] ARITHMETIC = {"+", "-", "*"};

    public static String[][] start(Scanner userInput) {
        int cnt = 0;
        Random randomizer = new Random();
        int numberA;
        int numberB;
        int index;
        int answer = 0;
        String[][] qA = new String[3][2];
        while (cnt <= 2) {
            numberA = randomizer.nextInt(0, 100);
            numberB = randomizer.nextInt(0, 100);
            index = randomizer.nextInt(0, 3);

            switch (index) {
                case 0:
                    answer = numberA + numberB;
                    break;
                case 1:
                    answer = numberA - numberB;
                    break;
                case 2:
                    answer = numberA * numberB;
            }
            qA[cnt][0] = numberA + " " + ARITHMETIC[index] + " " + numberB;
            qA[cnt][1] = answer + "";
            cnt++;
        }
        return qA;
    }
}
