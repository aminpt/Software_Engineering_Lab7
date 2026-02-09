package edu.ticket.strategy;

public class BusStrategy implements TravelStrategy {
    @Override
    public double calculatePrice() {
        return 50000.0; //sample price
    }

    @Override
    public String getDescription() {
        return "Safar ba Otobus";
    }
}
