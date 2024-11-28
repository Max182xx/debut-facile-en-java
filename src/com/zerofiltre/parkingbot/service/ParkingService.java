package com.zerofiltre.parkingbot.service;

import com.zerofiltre.parkingbot.model.Ticket;
import com.zerofiltre.parkingbot.model.Vehicle;
import com.zerofiltre.parkingbot.model.VehiculeModelEnum;

import java.util.Date;

public class ParkingService {

    public Ticket processIncomingVehicle(Vehicle vehicle) {
        Ticket ticket = new Ticket();
        Date now = new Date();
        ticket.setEnteringTime(now);
        ticket.setVehicle(vehicle);
        return ticket;
    }

    public Ticket processExitingTicket(Ticket ticket) {

        long now = new Date().getTime();
        now += 60 * 60 * 1000;

        Date exitTime = new Date(now);
        ticket.setExitTime(exitTime);


        Vehicle vehicle = ticket.getVehicle();
        VehiculeModelEnum category = vehicle.getCategory();

        double pricePerMinForCitadine = 0.08;
        double pricePerMinFor2Roue = 0.02;
        double defaulfPricePerMin = 0.04;

        long durationInMinutes = (ticket.getExitTime().getTime() - ticket.getEnteringTime().getTime()) / (60 * 1000);

        double finalprice = 0;
        /*if ("CITADINE".equals(category)) {
            finalprice = durationInMinutes * pricePerMinForCitadine;
        } else if ("2 ROUES".equals(category)) {
            finalprice = durationInMinutes * pricePerMinFor2Roue;
        } else {
            finalprice = durationInMinutes * defaulfPricePerMin;
        }*/

        switch (category) {
            case CITADINE:
                finalprice = durationInMinutes * pricePerMinForCitadine;
                break;
            case DEUXROUES:
                finalprice = durationInMinutes * pricePerMinFor2Roue;
                break;
            default:
                finalprice = durationInMinutes * defaulfPricePerMin;
        }

        ticket.setAmount(finalprice);
        return ticket;
    }

}
