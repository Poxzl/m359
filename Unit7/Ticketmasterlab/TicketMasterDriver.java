package Unit7.Ticketmasterlab;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        TicketMaster ticketMaster = new TicketMaster();
        System.out.println(ticketMaster);

        // display welcoe message
        // ask user to make a choice 1-6
        System.out.println("1, 2 ,3 ,4 5, 6 CHOOSE");
        Scanner input = new Scanner(System.in);
        boolean correctChosen = false;
        while(!correctChosen){
            try{
                int chosen = input.nextInt();
                correctChosen = true;
            } catch (InputMismatchException e) {
                System.out.println("Please enter an integer");
                input.nextLine();
            }
        }
    }
}
