package edu.ticket.state;
import edu.ticket.TicketService;

public class OrderedState implements TicketState {
    @Override
    public void pay(TicketService ticket) {
        System.out.println("Pardaakht anjam shod.");
        ticket.setState(new PaidState());
    }

    @Override
    public void cancel(TicketService ticket) {
        System.out.println("Darkhast laghv shod.");
        ticket.setState(new CancelledState());
    }
}
