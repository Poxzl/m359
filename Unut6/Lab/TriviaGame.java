package Unut6.Lab;

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
        File myFile = new File("allQuest.txt");
        Scanner fileIn = new Scanner(myFile);

        for (int i = 0; i < 4; i++) {
                String questText = fileIn.nextLine();
                int points = fileIn.nextInt();
                fileIn.nextLine();
                String a1 = fileIn.nextLine();
                String a2 = fileIn.nextLine();
                String a3 = fileIn.nextLine();
                String a4 = fileIn.nextLine();
                int correctAnswer = fileIn.nextInt();
                if(fileIn.hasNextLine()) {
                    fileIn.nextLine();
                }
                Question myQuestion = new Question(questText, points, a1, a2, a3, a4, correctAnswer);
                System.out.println(myQuestion);
                myTriv[i] = myQuestion;
        }
    }
}
