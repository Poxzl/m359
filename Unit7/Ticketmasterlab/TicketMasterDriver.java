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
        System.out.println("1. Search By City\n2. Search By Performer A-Z\n3. Search By Performer Z-A");
        Scanner input = new Scanner(System.in);
        boolean correctChosen = false;
        while(!correctChosen){
            try{
                int chosen = input.nextInt();
                input.nextLine();
                correctChosen = true;

                if(chosen == 1){
                    boolean foundOne = false;
                    System.out.println("Type the name of the city, make sure to spell it correctly!");
                    String cityToSearch = input.nextLine();
                    String output = "";
                    for (Show a : ticketMaster.searchByCity(cityToSearch)) {
                        output += a;
                        foundOne = true;
                    }
                    if(foundOne){
                        System.out.println("Date   |    Price  |  Quantity  |  Name   |    City");
                        System.out.println(output);
                    }else{
                        System.out.println("There weren't any shows that match your searched, sorry!");
                    }
                }

                if(chosen == 2){
                    ticketMaster.sortByPerformerAZ();
                    System.out.println(ticketMaster);
                }
                if(chosen == 3){
                    ticketMaster.sortByPerformerZA();
                    System.out.println(ticketMaster);
                }
                if(chosen == 4){
                    ticketMaster.sortByPriceLowToHigh();
                    System.out.println(ticketMaster);
                }
                if(chosen == 5){
                    ticketMaster.sortByPriceHighToLow();
                    System.out.println(ticketMaster);
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter an integer");
                input.nextLine();
            }
        }
    }
}
