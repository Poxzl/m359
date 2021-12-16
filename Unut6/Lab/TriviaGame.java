package Unut6.Lab;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;


public class TriviaGame {
    //houses all the Questions for the game
    private Question[] myTriv = new Question[4];
    private int streak = 0;
    private int totalPoints = 0;
    private int[] questionsChose = new int[4];
    private int highestStreak = 0;
    private double numCorrect = 0;
    private int numTimes = 0;


    public Question getRanQuestion(){
        while (true) {
            // pick a random # 0-11
            int rndm = (int) (Math.random() * 4);
            // check if that question has already been used
            if(this.getMyTriv()[rndm].isUsed() == false){
                this.getMyTriv()[rndm].setUsed(true);
                return this.getMyTriv()[rndm];
            }
        }
    }

    /**
     * this method goes through the question of the myTriv array, and accepts input and checks if that input is right,
     * and changes the total points and streak variable accordingly
     */
    public void printNAnswerQuestions(){
        Scanner input = new Scanner(System.in);

        numTimes = 0;
        while(true){
            //checks if it should end because its ran out of questions
            if(numTimes == 4){
                break;
            }
            this.setNumTimes(this.getNumTimes() + 1);
            System.out.println("POINTS GAINED: " + this.getTotalPoints());
            System.out.println("STREAK: " + this.getStreak());
            if(this.getNumTimes() != 1){
                //asks the user if they want to continue
                System.out.println("Do you want another question? \nn = No :(, y = Yes :)");
                String yesrno = input.nextLine();
                if(yesrno.equalsIgnoreCase("n")){
                    break;
                }
            }
            //gets a random question
            Question nowQuest = this.getRanQuestion();
            System.out.print(nowQuest);
            System.out.println("What's Your Answer?");
            if(input.nextInt() == nowQuest.getNumCor()){
                System.out.println("CORRECTTTTT!!!!");
                this.setTotalPoints(this.getTotalPoints() + nowQuest.getValue());
                this.setStreak(this.getStreak() + 1);
                this.setNumCorrect(this.getNumCorrect() + 1);
            }else {
                System.out.println("wrong :(");
                System.out.println("Correct Answer: " + nowQuest.getNumCor());
                this.setTotalPoints(this.getTotalPoints() - nowQuest.getValue());
                //checks if the streak beat the previous streak
                if(this.getStreak() > this.getHighestStreak()){
                    this.setHighestStreak(this.getStreak());
                }
                this.setStreak(0);
            }
            input.nextLine();
        }
    }

    /**
     * This method prints the information about the game after the user has ended the game or ran out of questions.
     */
    public void finished(){
        System.out.println("THANK FOR PLAYING !!!!!");
        System.out.println("YOUR POINTS: " + this.getTotalPoints());
        System.out.println("YOUR HIGHEST STREAK: " + this.getHighestStreak());
        System.out.println("PERCENT CORRECT: %" + (int)((100 * this.getNumCorrect() / this.getNumTimes())));
    }
    /**
     * This method prints the information about the game before the user has started the game
     */
    public void start(){
        System.out.println("TRIVIA TIME!!!!!! :>");
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Welcome " + name + "\nLet's play some TRIVIA!!!!");
        System.out.println("Every question that shows up will have 4 numbered answers to choose from\nType the corresponding number to chose an answer\nYour total points will change depending on the point value of the question");
        //welcome name, say rules
        System.out.println("type START! to start");
        //type start

        while(true){
            if(input.nextLine().equals("START!")){
                break;
            }
            System.out.println("I think you meant to say START!");
        }
    }


    public int[] getQuestionsChose() {
        return questionsChose;
    }

    public void setQuestionsChose(int[] questionsChose) {
        this.questionsChose = questionsChose;
    }

    /**
     * This method accepts a text file with lines of questions and answers and turns them
     * into a Question, then it goes through the next lines and so on until its filled the array with 12 questions.
     * @throws FileNotFoundException
     */
    public TriviaGame() throws FileNotFoundException{
        this.streak = 0;
        this.totalPoints = 0;

        // read in from the file into myTriv array
        File myFile = new File("allQuest.txt");
        Scanner fileIn = new Scanner(myFile);
        //goes through file
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

    public int getHighestStreak() {
        return highestStreak;
    }

    public void setHighestStreak(int highestStreak) {
        this.highestStreak = highestStreak;
    }

    public double getNumCorrect() {
        return numCorrect;
    }

    public void setNumCorrect(double numCorrect) {
        this.numCorrect = numCorrect;
    }

    public int getNumTimes() {
        return numTimes;
    }

    public void setNumTimes(int numTimes) {
        this.numTimes = numTimes;
    }
}









/*import java.io.FileNotFoundException;
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
*/