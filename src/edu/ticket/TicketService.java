package edu.ticket;

import edu.ticket.state.TicketState;
import edu.ticket.state.OrderedState;
import edu.ticket.strategy.TravelStrategy;

public class TicketService {
    private TravelStrategy travelStrategy;
    private TicketState currentState;

    public TicketService(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
        this.currentState = new OrderedState();
    }

    public void setState(TicketState state) {
        this.currentState = state;
    }

    public void buy() {
        currentState.pay(this);
    }

    public void cancel() {
        currentState.cancel(this);
    }

    public double getPrice() {
        return travelStrategy.calculatePrice();
    }

    public String getDescription() {
        return travelStrategy.getDescription();
    }
}