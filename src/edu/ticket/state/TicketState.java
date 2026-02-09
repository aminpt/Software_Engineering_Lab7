package edu.ticket.state;
import edu.ticket.TicketService;

public interface TicketState {
    void pay(TicketService ticket);
    void cancel(TicketService ticket);
}
