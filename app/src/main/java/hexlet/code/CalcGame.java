package hexlet.code;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class CalcGame {
    private static final String[] ARITHMETIC = {"+", "-", "*"};

    public static void start(Scanner userInput) {
        System.out.println("What is the result of the expression?");
        Random randomizer = new Random();
        int index;
        int numberA;
        int numberB;
        int answer;
        int cnt = 3;
        while (cnt != 0) {
            numberA = randomizer.nextInt(0, 100);
            numberB = randomizer.nextInt(0, 100);
            index = randomizer.nextInt(0, 3);
            System.out.print("Question: " + numberA + " " + ARITHMETIC[index] + " " + numberB
                    + "\nYour answer: ");
            while (true) {
                try {
                    answer = userInput.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("Incorrect input, enter number: ");
                    userInput.nextLine(); //отчистка потока ввода
                }
            }
            switch (index) {
                case 0:
                    if (answer == numberA + numberB) {
                        System.out.println("Correct!");
                        cnt--;
                    } else {
                        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                                + (numberA + numberB) + "'.\nLet's try again, " + Cli.userName + "!");
                        System.exit(0);
                    }
                    break;
                case 1:
                    if (answer == numberA - numberB) {
                        System.out.println("Correct!");
                        cnt--;
                    } else {
                        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                                + (numberA - numberB) + "'.\nLet's try again, " + Cli.userName + "!");
                        System.exit(0);
                    }
                    break;
                case 2:
                    if (answer == numberA * numberB) {
                        System.out.println("Correct!");
                        cnt--;
                    } else {
                        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                                + (numberA * numberB) + "'.\nLet's try again, " + Cli.userName + "!");
                        System.exit(0);
                    }
            }
        }
        System.out.println("Congratulations, " + Cli.userName + "!");
    }
}
