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
            String performer = namesandplace.substring(1, index);
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

    public void sortByPerformerAZ() {
        for (int i = 0; i < this.shows.size() - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < this.shows.size(); j++) {
                if(this.shows.get(j).getPerformer().compareToIgnoreCase(this.shows.get(minIndex).getPerformer()) < 0){
                    minIndex = j;
                }
            }
            Show temp = this.shows.get(i);
            this.shows.set(i, this.shows.get(minIndex));
            this.shows.set(minIndex, temp);
        }
    }

    public void sortByPerformerZA() {
        for (int i = 0; i < this.shows.size() - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < this.shows.size(); j++) {
                if (this.shows.get(j).getPerformer().compareToIgnoreCase(this.shows.get(minIndex).getPerformer()) > 0) {
                    minIndex = j;
                }
            }
            Show temp = this.shows.get(i);
            this.shows.set(i, this.shows.get(minIndex));
            this.shows.set(minIndex, temp);
        }
    }

    public void sortByPriceLowToHigh(){
        for (int i = 1; i < this.shows.size(); i++) {
            double valueToInsert = this.shows.get(i).getPrice();
            int pos = i;
            while(pos > 0 && this.shows.get(pos - 1).getPrice() > valueToInsert){
                this.shows.get(pos).setPrice(this.shows.get(pos - 1).getPrice());
                //this.shows.set(pos, this.shows.get(pos - 1));
                pos--;
            }
            this.shows.get(pos).setPrice(valueToInsert);
            //this.shows.set(pos, valueToInsert);
        }
    }



    public void sortByPriceHighToLow(){
        for (int i = 1; i < this.shows.size(); i++) {
            double valueToInsert = this.shows.get(i).getPrice();
            int pos = i;
            while(pos > 0 && this.shows.get(pos - 1).getPrice() < valueToInsert){
                this.shows.get(pos).setPrice(this.shows.get(pos - 1).getPrice());
                //this.shows.set(pos, this.shows.get(pos - 1));
                pos--;
            }
            this.shows.get(pos).setPrice(valueToInsert);
            //this.shows.set(pos, valueToInsert);
        }
    }
}








        /* perf = " " + perf;
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

         */