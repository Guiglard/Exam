package model;

public class Clio extends Car {

  @Override
  Motor getMotor() {
    return new GasEngine();
  }

}
