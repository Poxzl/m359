package Unut6.Lab;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {
        Question[] listQuestions = new Question[4];
        TriviaGame game = new TriviaGame(listQuestions, 0, 0);
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hi " + name);

    }
}
