package model;

public class Megane extends Car {

  @Override
  Motor getMotor() {
    return new ElectricMotor();
  }

}
