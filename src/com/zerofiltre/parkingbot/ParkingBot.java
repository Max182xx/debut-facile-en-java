package com.zerofiltre.parkingbot;

import com.zerofiltre.parkingbot.model.Ticket;
import com.zerofiltre.parkingbot.model.Vehicule;
import com.zerofiltre.parkingbot.service.ParkingService;



public class ParkingBot {

  public static void main(String[] args) {
    processVehicules();
  }

  private static void processVehicules() {
    Vehicule vehicule = new Vehicule();
    vehicule.setRegistrationNumber("LS-666-DV");
    vehicule.setCategory("Citadine");
    ParkingService parkingService = new ParkingService();
    Ticket ticket = parkingService.processIncomingVehicule(vehicule);

    System.out.println(ticket);
  }

}
