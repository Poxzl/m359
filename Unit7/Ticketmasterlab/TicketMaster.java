package Unit7.Ticketmasterlab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMaster {
    private ArrayList<Show> shows = new ArrayList<Show>();


    public TicketMaster() throws FileNotFoundException {
        File myFile = new File("showData.txt");
        Scanner fileIn = new Scanner(myFile);
        while(fileIn.hasNextLine()){
            System.out.println("bruh");
            String date = fileIn.next();
            double price = fileIn.nextDouble();
            int quant = fileIn.nextInt();
            String performer = fileIn.next();
            String city = fileIn.next();
            fileIn.nextLine();
        }
    }
}
