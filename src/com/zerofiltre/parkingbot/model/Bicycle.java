package com.zerofiltre.parkingbot.model;

public class Bicycle extends Vehicle{

  @Override
  public VehiculeModelEnum getCategory() {
    return VehiculeModelEnum.DEUXROUES;
  }

}
