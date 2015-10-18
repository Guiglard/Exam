package main;

import model.Clio;
import model.Megane;

public class Test {

  /*
   * Résulat attendu: 
   * "Je démarre ma Clio." 
   * "vroum" 
   * "Je démarre ma Mégane." 
   * "bzzzz"
   */
  public static void main(String[] args) {
    new Clio().start();
    new Megane().start();
  }

}
