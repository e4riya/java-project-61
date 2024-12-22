package hexlet.code;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PrimeNumberGame {
    private static int[] primeNum = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
                                     43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

    public static void start(Scanner userInput) {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Random randomizer = new Random();
        int number;
        String answer;
        int cnt = 3;
        while (cnt != 0) {
            number = randomizer.nextInt(0, 100);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            answer = userInput.next();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.print("Incorrect input, enter 'yes' or 'no': ");
                answer = userInput.next(); //<-
            }
            if ((Arrays.binarySearch(primeNum, number) >= 0 && answer.equals("yes"))
                    || (Arrays.binarySearch(primeNum, number) < 0 && answer.equals("no"))) {
                System.out.println("Correct!");
                cnt--;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + (answer.equals("yes") ? "no" : "yes") + "'" + "\nLet`s try again, " + Cli.userName + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + Cli.userName + "!");

    }
}
