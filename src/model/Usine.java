package model;

public class Usine {

  public static Car buildCar(CarBrand brand) {
    switch (brand) {
      case CLIO :
        return new Clio();
      case MEGANE:
        return new Megane();
      default:
        throw new IllegalArgumentException();
    }
  }

}
