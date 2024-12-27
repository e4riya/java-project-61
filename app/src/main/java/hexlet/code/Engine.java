package hexlet.code;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Engine {
    public static void startGame(Scanner userInput, String[][] data, Answers type) {
        int cnt = 0;
        String answer = "";
        while (cnt <= 2) {
            System.out.println("Question: " + data[cnt][0]);
            System.out.print("Your answer: ");
            answer = type == Answers.INT ? inputIntAnswer(userInput) : inputYesNoAnswer(userInput);
            if (answer.equals(data[cnt][1])) {
                System.out.println("Correct!");
                cnt++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + data[cnt][1] + "'.\n"
                        + "Let`s try again, " + Cli.userName + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + Cli.userName + "!");
    }

    public static String inputIntAnswer(Scanner userInput) {
        int answer = 0;
        while (true) {
            try {
                answer = userInput.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.print("Incorrect input, enter number: ");
                userInput.nextLine(); //отчистка потока ввода
            }
        }
        return answer + "";
    }

    public static String inputYesNoAnswer(Scanner userInput) {
        String answer = userInput.next();
        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.out.print("Incorrect input, enter 'yes' or 'no': ");
            answer = userInput.next(); //<-
        }
        return answer;
    }
}
