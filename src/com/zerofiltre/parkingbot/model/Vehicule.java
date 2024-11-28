package com.zerofiltre.parkingbot.model;

public class Vehicule {

    private String registrationNumber;
    private String category;

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Vehicule{");
        sb.append("registrationNumber='").append(registrationNumber).append('\'');
        sb.append(", category='").append(category).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
