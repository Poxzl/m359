package Unit7.Ticketmasterlab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMaster {
    private ArrayList<Show> shows = new ArrayList<Show>();


    public TicketMaster() throws FileNotFoundException {
        makeShows();
    }

    public void makeShows() throws FileNotFoundException {
        File myFile = new File("showData.txt");
        Scanner fileIn = new Scanner(myFile);
        while (fileIn.hasNextLine()) {
            String date = fileIn.next();
            double price = fileIn.nextDouble();
            int quant = fileIn.nextInt();
            String namesandplace = fileIn.nextLine();
            int index = namesandplace.indexOf(",");
            String performer = namesandplace.substring(0, index);
            String city = namesandplace.substring(index + 2);
            Show show = new Show(date, price, quant, performer, city);
            shows.add(show);
        }
    }

    public ArrayList<Show> getShows() {
        return shows;
    }

    public void setShows(ArrayList<Show> shows) {
        this.shows = shows;
    }
}
