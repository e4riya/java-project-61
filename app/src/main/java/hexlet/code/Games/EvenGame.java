package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Random;

public class EvenGame {
    private static final int MAX_NUMBER = 1000;

    public static String[][] generateQuestionsAndAnswers() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random randomizer = new Random();
        String[][] qA = new String[Engine.NUMBER_OF_ROUNDS][2];
        int cnt = 0;
        while (cnt < Engine.NUMBER_OF_ROUNDS) {
            int number = randomizer.nextInt(0, MAX_NUMBER);
            String answer = number % 2 == 0 ? "yes" : "no";
            qA[cnt][0] = number + "";
            qA[cnt][1] = answer;
            cnt++;
        }
        return qA;
    }
}
