package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {
    private static final int MAX_NUMBER = 1000;
    public static String[][] start(Scanner userInput) {
        int cnt = 0;
        Random randomizer = new Random();
        int number;
        String answer;
        String[][] qA = new String[Engine.NUMBER_OF_ROUNDS][2];
        while (cnt <= 2) {
            number = randomizer.nextInt(0, MAX_NUMBER);
            answer = number % 2 == 0 ? "yes" : "no";
            qA[cnt][0] = number + "";
            qA[cnt][1] = answer;
            cnt++;
        }
        return qA;
    }
}
