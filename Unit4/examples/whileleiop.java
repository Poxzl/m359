package Unit4.examples;
import java.util.Scanner;


public class whileleiop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String reply = "";
        boolean isDone = false;
        double count = 0.0;
        int total = 0;

        while(!isDone){
            System.out.println("Score?");
            reply = input.nextLine();

            if(reply.equalsIgnoreCase("y")){
                System.out.println("soooooooo");
                int nextNum = input.nextInt();
                count++;
                total += nextNum;

            }else System.out.println(total/count);
        }
    }
}
