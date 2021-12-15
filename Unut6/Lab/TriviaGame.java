package Unut6.Lab;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class TriviaGame {
    private Question[] myTriv = new Question[4];
    private int streak;
    private int totalPoints;
    private int[] questionsChose = new int[4];

    public String getRanQuestion(){
        while (true) {
            // pick a random # 0-11
            int rndm = (int) (Math.random() * 4);
            // check if that question has already been used
            if(this.getMyTriv()[rndm].isUsed() == false){
                return this.getMyTriv()[rndm].toString();
            }

            // while it's no good, pick a new #

            // at this point, our random # is good, so display that q
        }
    }


    public int[] getQuestionsChose() {
        return questionsChose;
    }

    public void setQuestionsChose(int[] questionsChose) {
        this.questionsChose = questionsChose;
    }

    public TriviaGame() throws FileNotFoundException{
        this.streak = 0;
        this.totalPoints = 0;

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
                //System.out.println(myQuestion);
                myTriv[i] = myQuestion;
        }
    }

    public void printQuestion(int idx){
        System.out.println("ergerge");
    }

    public Question getQuest(int idx){
        return myTriv[idx];
    }

    public Question[] getMyTriv() {
        return myTriv;
    }

    public void setMyTriv(Question[] myTriv) {
        this.myTriv = myTriv;
    }

    public int getStreak() {
        return streak;
    }

    public void setStreak(int streak) {
        this.streak = streak;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }
}
