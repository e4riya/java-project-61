package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Random;

public class ArifmeticProgressionGame {
    private static final int MIN_LENGTH_PROGRESSION = 5;
    private static final int MAX_LENGTH_PROGRESSION = 10;
    private static final int MAX_FIRST_NUM = 100;
    private static final int MAX_GAP = 10;

    public static String[][] generateQuestionsAndAnswers() {
        System.out.println("What number is missing in the progression? ");
        int cnt = 0;
        Random randomizer = new Random();
        String[][] qA = new String[Engine.NUMBER_OF_ROUNDS][2]; //question, answer x3
        while (cnt < Engine.NUMBER_OF_ROUNDS) {
            int length = randomizer.nextInt(MIN_LENGTH_PROGRESSION, MAX_LENGTH_PROGRESSION);
            int[] array = new int[length];

            int startNum = randomizer.nextInt(0, MAX_FIRST_NUM);
            int gap = randomizer.nextInt(1, MAX_GAP);

            for (int i = 0; i < array.length; i++) {
                array[i] = startNum;
                startNum += gap;
            }
            StringBuilder question = new StringBuilder();
            int index = randomizer.nextInt(1, length - 1);
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
