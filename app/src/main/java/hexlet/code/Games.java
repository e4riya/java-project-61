package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Games {
    public static void evenGame(Scanner userInput) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random randomizer = new Random();
        int number;
        int cnt = 3;
        String answer;
        while (cnt != 0) {
            number = randomizer.nextInt(0, 1000);
            System.out.print("Question: " + number + "\nAnswer: ");
            answer = userInput.next();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.print("Incorrect input, enter 'yes' or 'no': ");
                answer = userInput.next(); //<-
            }
            switch (answer) {
                case "yes":
                    if (number % 2 == 0) {
                        System.out.println("Correct!");
                        cnt--;
                    } else {
                        System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\nLet`s try again!, "
                                + Cli.userName + "!");
                    }
                    break;
                case "no":
                    if (number % 2 == 1) {
                        System.out.println("Correct!");
                        cnt--;
                    } else {
                        System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\nLet`s try again!, "
                                + Cli.userName + "!");
                    }
                    break;
            }
        }
        System.out.println("Congratulations, " + Cli.userName + "!");
    }
}
