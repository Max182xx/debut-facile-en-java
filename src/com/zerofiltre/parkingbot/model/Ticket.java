package com.zerofiltre.parkingbot.model;

import java.util.Date;

public class Ticket {

    private String amout;
    private Vehicule vehicule;
    private Date entreringTime;
    private Date exitTime;


    public String getAmout() {
        return amout;
    }

    public void setAmout(String amout) {
        this.amout = amout;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public Date getEntreringTime() {
        return entreringTime;
    }

    public void setEntreringTime(Date entreringTime) {
        this.entreringTime = entreringTime;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Ticket{");
        sb.append("amout='").append(amout).append('\'');
        sb.append(", vehicule=").append(vehicule);
        sb.append(", entreringTime=").append(entreringTime);
        sb.append(", exitTime=").append(exitTime);
        sb.append('}');
        return sb.toString();
    }
}
