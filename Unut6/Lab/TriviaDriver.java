package Unut6.Lab;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {
        TriviaGame game = new TriviaGame();

        //Prints all the starting statements
        game.start();

        //Prints all the Questions and asks for answers
        game.printNAnswerQuestions();

        //writes the finishing code and gives the details bout how you did
        game.finished();
    }
}



/*import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {
        TriviaGame game = new TriviaGame();


        System.out.println("TRIVIA TIME!!!!!! :0");

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("welcome " + name + "\nLet's play some TRIVIA!!!!");
        //welcome name, say rules
        System.out.println("type START! to start");
        //type start
        while(true){
            if(input.nextLine().equals("START!")){
                break;
            }
            System.out.println("I think you meant to say START!");
        }


        System.out.println(game.getRanQuestion());
        System.out.println(game.getRanQuestion());
        System.out.println(game.getRanQuestion());
        System.out.println(game.getRanQuestion());
    }
            // pick a random question, display it

            // read user's answer (input)


            // check if it's right or wrong, and handle appropriately

    }
*/