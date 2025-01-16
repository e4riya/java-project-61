package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {
    public static String[][] start(Scanner userInput) {
        int cnt = 0;
        Random randomizer = new Random();
        int number;
        String answer;
        String[][] qA = new String[3][2];
        while (cnt <= 2) {
            number = randomizer.nextInt(0, 1000);
            answer = number % 2 == 0 ? "yes" : "no";
            qA[cnt][0] = number + "";
            qA[cnt][1] = answer;
            cnt++;
        }
        return qA;
    }
}
