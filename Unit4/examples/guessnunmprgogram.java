package Unit4.examples;
import java.util.Scanner;

public class guessnunmprgogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean guessed = false;
        int tries = 0;
        int reply = 0;
        int ranInt = (int)(Math.random() * 10 + 1);
        while(!guessed){
            tries++;
            System.out.println("guess a num, any num");
            reply = input.nextInt();
            if(reply > ranInt){
                System.out.println("too high ijiot");
            }else if(reply < ranInt){
                System.out.println("too low ijiot");
            }else{
                System.out.println("CONGRARA, took like " + tries + " tries lamo");
                guessed = true;
            }
        }
    }
}
