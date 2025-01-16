package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class ArifmeticProgressionGame {
    public static String[][] start(Scanner userInput) {
        int cnt = 0;
        Random randomizer = new Random();
        int length;
        int startNum;
        int gap;
        int index;
        String[][] qA = new String[3][2]; //question, answer x3
        while (cnt <= 2) {
            length = randomizer.nextInt(5, 10);
            int[] array = new int[length];

            startNum = randomizer.nextInt(0, 100);
            gap = randomizer.nextInt(1, 10);

            for (int i = 0; i < array.length; i++) {
                array[i] = startNum;
                startNum += gap;
            }
            StringBuilder question = new StringBuilder();
            index = randomizer.nextInt(0, length - 1);
            for (int i = 0; i < length; i++) {
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
