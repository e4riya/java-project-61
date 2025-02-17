package hexlet.code;

import hexlet.code.Games.ArifmeticProgressionGame;
import hexlet.code.Games.CalcGame;
import hexlet.code.Games.EvenGame;
import hexlet.code.Games.NodGame;
import hexlet.code.Games.PrimeNumberGame;

import java.util.Scanner;

public class App {
    private static final String GREET = "1";
    private static final String EVEN = "2";
    private static final String CALC = "3";
    private static final String GCD = "4";
    private static final String PROGRESSION = "5";
    private static final String PRIME = "6";

    private static String userName = "";

    public static void main(String[] args) {
        gameSelection();
    }

    public static void gameSelection() {
        System.out.println("Please enter the game number and press Enter."
                + "\n1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        Scanner userInput = new Scanner(System.in);

        String inputNum = userInput.nextLine();
        switch (inputNum) {
            case GREET:
                inputName(userInput);
                return;
            case EVEN:
                inputName(userInput);
                Engine.startGame(userInput, EvenGame.start(userInput));
                return;
            case CALC:
                inputName(userInput);
                Engine.startGame(userInput, CalcGame.start(userInput));
                return;
            case GCD:
                inputName(userInput);
                Engine.startGame(userInput, NodGame.start(userInput));
                return;
            case PROGRESSION:
                inputName(userInput);
                Engine.startGame(userInput, ArifmeticProgressionGame.start(userInput));
                return;
            case PRIME:
                inputName(userInput);
                Engine.startGame(userInput, PrimeNumberGame.start(userInput));
                return;
            default:
                System.exit(0);
        }
    }

    public static void inputName(Scanner userInput) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = userInput.nextLine();
        userName = name;
        System.out.println("Hello, " + name + "!");
    }

    public static String getUserName() {
        return userName;
    }
}

