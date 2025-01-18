package hexlet.code;

import java.util.Scanner;

public class App {
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
                case 0:
                    System.exit(0);
                    return;
                case 1:
                    Cli.getName(userInput);
                    return;
                case 2:
                    Cli.getName(userInput);
                    Engine.startGame(userInput, EvenGame.start(userInput));
                    return;
                case 3:
                    Cli.getName(userInput);
                    Engine.startGame(userInput, CalcGame.start(userInput));
                    return;
                case 4:
                    Cli.getName(userInput);
                    Engine.startGame(userInput, NodGame.start(userInput));
                    return;
                case 5:
                    Cli.getName(userInput);
                    Engine.startGame(userInput, ArifmeticProgressionGame.start(userInput));
                    return;
                case 6:
                    Cli.getName(userInput);
                    Engine.startGame(userInput, PrimeNumberGame.start(userInput));
                    return;
                default:
                    throw new NumberFormatException();
            }
        }catch (NumberFormatException e){
            System.out.println("Not a valid number.");
            gameSelection();
        }
    }
}

