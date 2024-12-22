package hexlet.code;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NodGame {
    public static void start(Scanner userInput) {
        System.out.println("Find the greatest common divisor of given numbers.");
        Random randomizer = new Random();
        int numberA;
        int numberB;
        int answer;
        int cnt = 3;
        while (cnt != 0) {
            numberA = randomizer.nextInt(1, 100);
            numberB = randomizer.nextInt(1, 100);
            if (Nod(numberA,numberB) == 1) {
                continue;
            }
            System.out.println("Question: " + numberA + " " + numberB);
            System.out.print("Your answer: ");
            while (true) {
                try {
                    answer = userInput.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("Incorrect input, enter number: ");
                    userInput.nextLine(); //отчистка потока ввода
                }
            }
            if (answer == Nod(numberA,numberB)) {
                System.out.println("Correct!");
                cnt--;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + Nod(numberA, numberB) +
                        "'" + "\nLet`s try again, " + Cli.userName + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + Cli.userName + "!");
    }

    private static int Nod(int a, int b) {
        if (a != 0 && b != 0) {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            return a;
        }
        return 0;
    }
}
