package RicksShiny;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTest {

  public static void main(String[] args) {
//Set up Rick's aguitar inventory
    Inventory inventory = new Inventory();

    initilaizeInventory(inventory);

    //Too many models so we cannot limit like types
    Guitar whatErinLikes = new Guitar("", 0, Builder.FENDER, "Stratocastor", Type.ELECTRIC,
        Wood.ALDER, Wood.ALDER);

    List matchingGuitars = inventory.search(whatErinLikes);

    if (!matchingGuitars.isEmpty()){
      for (Iterator i = matchingGuitars.iterator(); i.hasNext();){

      Guitar guitar = (Guitar) i.next();
      System.out.println("Ering you might like this" +
          guitar.getBuilder() + " " + guitar.getModel() + " " +
          guitar.getType() + " guitar:\n   " + guitar.getBackWood() + " back and sides, \n" + guitar.getTopWood() + " top.\nYou can " +
          "have it for only $" + guitar.getPrice() + "!");
    } }
    else {
      System.out.println("Sorry, Erin, we have nothing for you.");
    }

  }

  private static void initilaizeInventory(Inventory inventory) {

    Guitar guitarTwo = new Guitar("532434", 0, Builder.FENDER, "Stratocastor", Type.ELECTRIC,
        Wood.ALDER, Wood.ALDER);


    inventory.addGuitar("123231", 0, Builder.FENDER, "Stratocastor", Type.ELECTRIC,
        Wood.ALDER, Wood.ALDER);

    inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC,
        Wood.ALDER, Wood.ALDER);
  }
}
