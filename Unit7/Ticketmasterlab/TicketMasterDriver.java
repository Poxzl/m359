package Unit7.Ticketmasterlab;


import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * makes the static ints to turn numbers into variables
 */
public class TicketMasterDriver {
    final static int one = 1;
    final static int two = 2;
    final static int three = 3;
    final static int four = 4;
    final static int five = 5;
    final static int six = 6;

    /**
     * The controller of the ticketmaster
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        TicketMaster ticketMaster = new TicketMaster();
        System.out.println(ticketMaster);

        // display welcoe message
        // ask user to make a choice 1-6

        Scanner input = new Scanner(System.in);
        boolean quit = false;
        while(!quit){
            System.out.println("1. Search By City\n2. Search By Performer A-Z\n3. Search By Performer Z-A\n4. Sort by price low-to-high\n5. Sort by price high-to-low\n6. Quit  >:[");
            boolean correctChosen = false;
            while(!correctChosen){
                //checks if the number chosen is out of bounds or not a int
                try{
                    int chosen = input.nextInt();
                    if(chosen > 6 || chosen < 1){
                        chosen = 999;
                    }
                    input.nextLine();
                    correctChosen = true;

                    if(chosen == one){
                        //searches through the shows array and prints the array that has all the shows in that city
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
                    // sorts performers A-Z and prints
                    if(chosen == two){
                        ticketMaster.sortByPerformerAZ();
                        System.out.println(ticketMaster);
                    }
                    // sorts performers Z-A and prints
                    else if(chosen == three){
                        ticketMaster.sortByPerformerZA();
                        System.out.println(ticketMaster);
                    }
                    // sorts price lowtohigh and prints
                    else if(chosen == four){
                        ticketMaster.sortByPriceLowToHigh();
                        System.out.println(ticketMaster);
                    }
                    // sorts price lowtohigh and prints
                    else if(chosen == five){
                        ticketMaster.sortByPriceHighToLow();
                        System.out.println(ticketMaster);
                    }
                    //quits by allowing loop to end
                    else if(chosen == six){
                        System.out.println("SEE YA!");
                        quit = true;
                    }
                    //checks if its out of bounds and doesnt do anything
                    else if(chosen == 999){
                        System.out.println("That's not an number on the list, select a number 1-6");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Please enter an integer");
                    input.nextLine();
                }
            }
        }
    }
}
