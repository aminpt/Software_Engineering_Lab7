import edu.ticket.*;
import edu.ticket.strategy.BusStrategy;
import edu.ticket.strategy.FlightStrategy;
import edu.ticket.state.PaidState;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Scenario 1: Bus Ticket (Successful) ---");
        TicketService busTicket = new TicketService(new BusStrategy());
        System.out.println("Price: " + busTicket.getPrice());
        System.out.println("Desc: " + busTicket.getDescription());

        busTicket.buy();

        busTicket.buy();

        System.out.println("\n--- Scenario 2: Flight Ticket (Cancelled) ---");
        TicketService flightTicket = new TicketService(new FlightStrategy());
        System.out.println("Price: " + flightTicket.getPrice());

        flightTicket.cancel();

        flightTicket.buy();
    }
}
