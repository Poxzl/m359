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
        System.out.println("1. Search By City\n2. Search By Performer");
        Scanner input = new Scanner(System.in);
        boolean correctChosen = false;
        while(!correctChosen){
            try{
                int chosen = input.nextInt();
                correctChosen = true;

                if(chosen == 1){
                    String cityToSearch = input.next();
                    System.out.println(cityToSearch);
                    String output = "";
                    for (Show a : ticketMaster.searchByCity(cityToSearch)) {
                        output += a;
                    }
                    System.out.println(output);
                }

                if(chosen == 2){

                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter an integer");
                input.nextLine();
            }
        }
    }
}
