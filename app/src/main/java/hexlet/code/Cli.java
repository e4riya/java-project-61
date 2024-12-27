package hexlet.code;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cli {
    public static String userName;

    public static void getName(Scanner userinput) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = userinput.next();
        userName = name;
        System.out.println("Hello, " + name + "!");
    }

    public static void gameSelection(Scanner userInput) {
        System.out.println("Please enter the game number and press Enter."
                + "\n1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        int s = 0;
        while (true) {
            try {
                s = userInput.nextInt(); //<-
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                userInput.nextLine(); //отчистка потока ввода
            }
        }
        if (s == 0) {
            System.exit(0);
        } else if (s > 6) {
            System.out.println("Select a value from 0 to 6");
            gameSelection(userInput);
        } else {
            getName(userInput);
            switch (s) {
                case 2:
                    System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                    Engine.startGame(userInput, EvenGame.start(userInput), Answers.YESorNO);
                    return;
                case 3:
                    System.out.println("What is the result of the expression?");
                    Engine.startGame(userInput, CalcGame.start(userInput), Answers.INT);
                    return;
                case 4:
                    System.out.println("Find the greatest common divisor of given numbers.");
                    Engine.startGame(userInput, NodGame.start(userInput), Answers.INT);
                    return;
                case 5:
                    System.out.println("What number is missing in the progression? ");
                    Engine.startGame(userInput, ArifmeticProgressionGame.start(userInput), Answers.INT);
                    return;
                case 6:
                    System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                    Engine.startGame(userInput, PrimeNumberGame.start(userInput), Answers.YESorNO);
            }
        }
    }
}
