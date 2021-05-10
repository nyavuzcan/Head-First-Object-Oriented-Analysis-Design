package RicksShiny;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTest {

  public static void main(String[] args) {
//Set up Rick's aguitar inventory
    Inventory inventory = new Inventory();

    initilaizeInventory(inventory);

    //Too many models so we cannot limit like types
    //Customer serialnumber and price null. This is unnecessary.
    //Change Guitar to GuitarSpec
    GuitarSpec whatErinLikes = new GuitarSpec( Builder.FENDER,  Type.ELECTRIC,"Stratocastor",
        Wood.ALDER, Wood.ALDER,0);

    List matchingGuitars = inventory.search(whatErinLikes);

    if (!matchingGuitars.isEmpty()){
      for (Iterator i = matchingGuitars.iterator(); i.hasNext();){

      Guitar guitar = (Guitar) i.next();
      GuitarSpec guitarSpec = guitar.getGuitarSpec();
      System.out.println("Ering you might like this" +
          guitarSpec.getBuilder() + " " + guitarSpec.getModel() + " " +
          guitarSpec.getType() + " guitar:\n   " + guitarSpec.getBackWood() + " back and sides, \n" + guitarSpec.getTopWood() + " top.\nYou can " +
          "have it for only $" + guitar.getPrice() + "!");
    } }
    else {
      System.out.println("Sorry, Erin, we have nothing for you.");
    }

  }

  private static void initilaizeInventory(Inventory inventory) {

    inventory.addGuitar("123231", 0, Builder.FENDER, "Stratocastor", Type.ELECTRIC,
        Wood.ALDER, Wood.ALDER,2);

    inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC,
        Wood.ALDER, Wood.ALDER,0);
  }
}
