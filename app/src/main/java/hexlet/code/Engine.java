package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBER_OF_ROUNDS = 3;

    public static void startGame(Scanner userInput, String[][] data) {
        int cnt = 0;
        while (cnt != NUMBER_OF_ROUNDS) {
            System.out.println("Question: " + data[cnt][0]);
            System.out.print("Your answer: ");
            String answer = userInput.nextLine(); // пользовательский ввод
            if (answer.equals(data[cnt][1])) {
                System.out.println("Correct!");
                cnt++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + data[cnt][1] + "'.\n"
                        + "Let's try again, " + App.getUserName() + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + App.getUserName() + "!");
    }
}
