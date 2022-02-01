package Unit7.Ticketmasterlab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMaster {
    private ArrayList<Show> shows;


    public TicketMaster() throws FileNotFoundException {
        shows = new ArrayList<>();
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

    public String toString() {
        System.out.println("Date   |    Price  |  Quantity  |  Name   |    City");
        String output = "";
        for (Show a : shows) {
            output += a;
        }
        return output;
    }

    public ArrayList<Show> searchByCity(String city){
        ArrayList<Show> showsInPlace = new ArrayList<>();
        for (int i = 0; i < this.shows.size(); i++) {
            if(this.shows.get(i).getCity().equalsIgnoreCase(city)){
                showsInPlace.add(this.shows.get(i));
            }
        }
        return showsInPlace;
    }

    public void searchByPerformer(String perf){
        perf = " " + perf;
        boolean foundOne = false;
        //String cityToSearch = input.nextLine();
        String output = "";
        for (Show a : this.shows) {
            if(a.getPerformer().equalsIgnoreCase(perf)){
                output += a;
                foundOne = true;
            }
        }
        if(foundOne){
            System.out.println("Date   |    Price  |  Quantity  |  Name   |    City");
            System.out.println(output);
        }else{
            System.out.println("There weren't any shows that match your searched, sorry!");
        }
    }
}
