package hexlet.code;

import java.util.Scanner;

public class App {
    private static final int EXIT = 0;
    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;

    public static void main(String[] args) {
        gameSelection();
    }

    public static void gameSelection() {
        System.out.println("Please enter the game number and press Enter."
                + "\n1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        Scanner userInput = new Scanner(System.in);
        int inputNum = 0;
        try {
            inputNum = Integer.parseInt(userInput.nextLine());
            switch (inputNum) {
                case EXIT:
                    System.exit(0);
                    return;
                case GREET:
                    Cli.inputName(userInput);
                    return;
                case EVEN:
                    Cli.inputName(userInput);
                    Engine.startGame(userInput, EvenGame.start(userInput));
                    return;
                case CALC:
                    Cli.inputName(userInput);
                    Engine.startGame(userInput, CalcGame.start(userInput));
                    return;
                case GCD:
                    Cli.inputName(userInput);
                    Engine.startGame(userInput, NodGame.start(userInput));
                    return;
                case PROGRESSION:
                    Cli.inputName(userInput);
                    Engine.startGame(userInput, ArifmeticProgressionGame.start(userInput));
                    return;
                case PRIME:
                    Cli.inputName(userInput);
                    Engine.startGame(userInput, PrimeNumberGame.start(userInput));
                    return;
                default:
                    throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            System.out.println("Not a valid number.");
            gameSelection();
        }
    }
}

