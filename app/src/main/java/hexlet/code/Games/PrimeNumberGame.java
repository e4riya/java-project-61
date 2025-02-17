package hexlet.code.Games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class PrimeNumberGame {
    private static final int MAX_NUMBER = 100;

    public static String[][] start(Scanner userInput) {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int cnt = 0;
        Random randomizer = new Random();
        String[][] qA = new String[Engine.NUMBER_OF_ROUNDS][2];
        while (cnt <= 2) {
            int number = randomizer.nextInt(0, MAX_NUMBER);
            String answer = isPrime(number) ? "yes" : "no";
            qA[cnt][0] = number + "";
            qA[cnt][1] = answer;
            cnt++;
        }
        return qA;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
