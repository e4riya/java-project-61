package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class CalcGame {
    private static final String[] ARITHMETIC = {"+", "-", "*"};
    private static final int MAX_NUMBER = 100;
    public static String[][] start(Scanner userInput) {
        System.out.println("What is the result of the expression?");
        int cnt = 0;
        Random randomizer = new Random();
        String[][] qA = new String[Engine.NUMBER_OF_ROUNDS][2];
        while (cnt <= 2) {
            int numberA = randomizer.nextInt(0, MAX_NUMBER);
            int numberB = randomizer.nextInt(0, MAX_NUMBER);
            int index = randomizer.nextInt(0, ARITHMETIC.length);
            int answer = 0;
            switch (index) {
                case 0:
                    answer = numberA + numberB;
                    break;
                case 1:
                    answer = numberA - numberB;
                    break;
                case 2:
                    answer = numberA * numberB;
                    break;
                default:
                    System.out.println("Unrealized operation");
                    System.exit(0);
            }
            qA[cnt][0] = numberA + " " + ARITHMETIC[index] + " " + numberB;
            qA[cnt][1] = answer + "";
            cnt++;
        }
        return qA;
    }
}
