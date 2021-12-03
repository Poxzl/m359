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
        File myFile = new File("New Text Document(2).txt");
        Scanner fileIn = new Scanner(myFile);
            String questText = fileIn.nextLine();
            int points = fileIn.nextInt();
            fileIn.nextLine();
            String a1 = fileIn.nextLine();
            String a2 = fileIn.nextLine();
            String a3 = fileIn.nextLine();
            String a4 = fileIn.nextLine();
            int correctAnswer = fileIn.nextInt();
        for (int i = 0; i < 7; i++) {
            myTriv[i] =
        }
    }
}
