package edu.ticket.state;
import edu.ticket.TicketService;

public class CancelledState implements TicketState {
    @Override
    public void pay(TicketService ticket) {
        System.out.println("Bilit laghv shode, nemitavanid pardakht konid.");
    }

    @Override
    public void cancel(TicketService ticket) {
        System.out.println("Bilit ghablan laghv shode ast.");
    }
}
