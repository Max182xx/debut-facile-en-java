package com.zerofiltre.parkingbot.model;

public class Car extends Vehicle{

  @Override
  public VehiculeModelEnum getCategory() {
    return VehiculeModelEnum.CITADINE;
  }
}
