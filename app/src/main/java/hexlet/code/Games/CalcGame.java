package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Random;

public class CalcGame {
    private static final String[] ARITHMETIC = {"+", "-", "*"};
    private static final int MAX_NUMBER = 100;
    public static String[][] generateQuestionsAndAnswers() {
        System.out.println("What is the result of the expression?");
        int cnt = 0;
        Random randomizer = new Random();
        String[][] questionAnswer = new String[Engine.NUMBER_OF_ROUNDS][2];
        while (cnt < Engine.NUMBER_OF_ROUNDS) {
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
                    throw new RuntimeException("Unrealized operation max index of operation is "
                            + (ARITHMETIC.length - 1) + " but we have " + index);
            }
            questionAnswer[cnt][0] = numberA + " " + ARITHMETIC[index] + " " + numberB;
            questionAnswer[cnt][1] = answer + "";
            cnt++;
        }
        return questionAnswer;
    }
}
