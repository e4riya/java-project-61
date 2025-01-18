package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String userName;

    public static void inputName(Scanner userInput) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = userInput.nextLine();
        userName = name;
        System.out.println("Hello, " + name + "!");
    }
    public static String getUserName(){
        return userName;
    }


}
