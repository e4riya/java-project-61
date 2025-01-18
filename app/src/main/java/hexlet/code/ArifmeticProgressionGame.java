package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class ArifmeticProgressionGame {
    private static final int MIN_LENGTH_PROGRESSION = 5;
    private static final int MAX_LENGTH_PROGRESSION = 10;

    public static String[][] start(Scanner userInput) {
        int cnt = 0;
        Random randomizer = new Random();
        int length;
        int startNum;
        int gap;
        int index;
        String[][] qA = new String[Engine.NUMBER_OF_ROUNDS][2]; //question, answer x3
        while (cnt <= 2) {
            length = randomizer.nextInt(MIN_LENGTH_PROGRESSION, MAX_LENGTH_PROGRESSION);
            int[] array = new int[length];

            startNum = randomizer.nextInt(0, 100);
            gap = randomizer.nextInt(1, 10);

            for (int i = 0; i < array.length; i++) {
                array[i] = startNum;
                startNum += gap;
            }
            StringBuilder question = new StringBuilder();
            index = randomizer.nextInt(1, length - 1);
            question.append(array[0]);
            for (int i = 1; i < length; i++) {
                if (i == index) {
                    question.append(" ..");
                } else {
                    question.append(" " + array[i]);
                }
            }
            qA[cnt][0] = question.toString();
            qA[cnt][1] = array[index] + "";
            cnt++;
        }
        return qA;
    }
}
