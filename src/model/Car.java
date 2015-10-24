package model;

public abstract class Car {

  private Motor engine;
  
  public Car() {
    engine = getMotor();
  }

  abstract Motor getMotor();

  public void start() {
    System.out.println("Je démarre ma " + getClass().getSimpleName() + ".");
    engine.start();
  }

}
