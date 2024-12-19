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
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");
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
        switch (s) {
            case 0:
                System.exit(0);
            case 1:
                getName(userInput);
                return;
            case 2:
                getName(userInput);
                Games.evenGame(userInput);
                return;
            default:
                System.out.println("Select a value from 0 to 3");
                gameSelection(userInput);
        }
    }
}
