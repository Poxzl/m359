package Unut6.Lab;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {
        TriviaGame game = new TriviaGame();


        // ask for their name and greet them
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hi " + name);
        System.out.println(game);
        // pick a random question, display it


        // read user's answer (input)


        // check if it's right or wrong, and handle appropriately

    }
}
