package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void startGame(Scanner userInput, String[][] data) {
        int cnt = 0;
        String answer = "";
        while (cnt <= 2) {
            System.out.println("Question: " + data[cnt][0]);
            System.out.print("Your answer: ");
            answer = userInput.nextLine(); // пользовательский ввод
            if (answer.equals(data[cnt][1])) {
                System.out.println("Correct!");
                cnt++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + data[cnt][1] + "'.\n"
                        + "Let's try again, " + Cli.userName + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + Cli.userName + "!");
    }
}
