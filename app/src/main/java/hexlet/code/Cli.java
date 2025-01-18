package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String userName;

    public static void getName(Scanner userInput) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = userInput.nextLine();
        userName = name;
        System.out.println("Hello, " + name + "!");
    }


}
