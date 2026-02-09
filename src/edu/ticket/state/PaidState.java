package edu.ticket.state;
import edu.ticket.TicketService;

public class PaidState implements TicketState {
    @Override
    public void pay(TicketService ticket) {
        System.out.println("Shoma ghablan pardakht kardeid.");
    }

    @Override
    public void cancel(TicketService ticket) {
        System.out.println("Bilit laghv shod va mablagh bargasht dade mishavad.");
        ticket.setState(new CancelledState());
    }
}
