package com.zerofiltre.parkingbot.service;

import com.zerofiltre.parkingbot.model.Ticket;
import com.zerofiltre.parkingbot.model.Vehicule;

import java.util.Date;

public class ParkingService {

    public Ticket processIncomingVehicule(Vehicule vehicule){
        Ticket ticket = new Ticket();
        Date now = new Date();
        ticket.setEntreringTime(now);
        ticket.setVehicule(vehicule);

        return ticket;
    }
}
