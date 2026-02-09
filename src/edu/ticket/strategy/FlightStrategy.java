package edu.ticket.strategy;

public class FlightStrategy implements TravelStrategy {
    @Override
    public double calculatePrice() {
        return 150000.0; //sample price
    }

    @Override
    public String getDescription() {
        return "Safar ba Parvaz";
    }
}
