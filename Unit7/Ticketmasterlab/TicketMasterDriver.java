package Unit7.Ticketmasterlab;

import java.io.FileNotFoundException;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        TicketMaster ticketMaster = new TicketMaster();
        System.out.println(ticketMaster.getShows());
    }
}
