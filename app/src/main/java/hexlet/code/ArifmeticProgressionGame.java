package hexlet.code;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArifmeticProgressionGame {
    public static void start(Scanner userInput){
        System.out.println("What number is missing in the progression?");
        Random randomizer = new Random();
        int length;
        int startNum;
        int gap;
        int index;
        int answer;
        int cnt = 3;
        while(cnt != 0){
            length = randomizer.nextInt(5, 10);
            int[] array = new int[length];
            startNum = randomizer.nextInt(0,100);
            gap = randomizer.nextInt(1,10);
            for(int i = 0;i < array.length;i++){
                array[i] = startNum;
                startNum += gap;
            }
            index = randomizer.nextInt(0,length-1);
            System.out.print("Question:");
            for(int i = 0; i < length; i++){
                if(i == index){
                    System.out.print(" ..");
                }else{
                    System.out.print(" " + array[i]);
                }
            }
            System.out.print("\nYour answer: ");
            while (true) {
                try {
                    answer = userInput.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("Incorrect input, enter number: ");
                    userInput.nextLine(); //отчистка потока ввода
                }
            }
            if(answer == array[index]){
                System.out.println("Correct!");
                cnt--;
            }else{
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + array[index] + "'.\n" +
                        "Let`s try again, " + Cli.userName + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + Cli.userName + "!");
    }
}
