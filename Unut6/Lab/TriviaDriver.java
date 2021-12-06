package Unut6.Lab;

import java.io.FileNotFoundException;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {
        Question[] listQuestions = new Question[3];
        TriviaGame game = new TriviaGame(listQuestions, 0, 0);
    }
}
