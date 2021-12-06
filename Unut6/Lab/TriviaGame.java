package Unut6.Lab;
import Unut6.exampels.Student;
import Unut6.exampels.course;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class TriviaGame {
    private Question[] myTriv;
    private int streak;
    private int totalPoints;


    public TriviaGame(Question[] myTriv, int streak, int totalPoints) throws FileNotFoundException{
        this.myTriv = myTriv;
        this.streak = streak;
        this.totalPoints = totalPoints;
        // read in from the file into myTriv array
        File myFile = new File("New Text Document (2).txt");
        Scanner fileIn = new Scanner(myFile);

        for (int i = 0; i < 3; i++) {
            if(fileIn.hasNextLine()) {
                String questText = fileIn.nextLine();
                int points = fileIn.nextInt();
                fileIn.nextLine();
                String a1 = fileIn.nextLine();
                String a2 = fileIn.nextLine();
                String a3 = fileIn.nextLine();
                String a4 = fileIn.nextLine();
                int correctAnswer = fileIn.nextInt();
                fileIn.nextLine();

                Question myQuestion = new Question(questText, points, a1, a2, a3, a4, correctAnswer);
                System.out.println(myQuestion);
                myTriv[i] = myQuestion;
            }
        }
    }
}
