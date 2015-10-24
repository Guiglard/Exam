package main;

import model.CarBrand;
import model.Usine;

public class Test {

  /*
   * Résulat attendu: 
   * "Je démarre ma Clio." 
   * "vroum" 
   * "Je démarre ma Mégane." 
   * "bzzzz"
   */
  public static void main(String[] args) {
    Usine.buildCar(CarBrand.CLIO).start();
    Usine.buildCar(CarBrand.MEGANE).start();
  }

}
