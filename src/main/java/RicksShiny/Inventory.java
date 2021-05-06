package RicksShiny;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
  private final List guitars;

  public Inventory() {
    guitars = new LinkedList();
  }

  /*
  THIS DESIGNG IS TERRIBLE! THE INVENTORY AND GUITAR CLASS DEPEND ON EACH OTHER TOO MUCH, AND I CAN'T SEE
  HOW THIS IS AN ARCHITECTURE THAT YOU'D EVER BE ABLE TO BUILD UPON WE NEED SOME RESTRUCTURING

   */
  void addGuitar(String serialNumber, double price, Builder builder,
                 String model, Type type, Wood backWood, Wood topWood) {
    Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);

    guitars.add(guitar);

  }

  public Guitar getGuitar(String serialNumber) {
    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar) i.next();
      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }
    return null;
  }

  /*
  Case Sensitive error, Also Every string compration is a bad idea we can use constant or enum

   */
  public Guitar search(Guitar searchGuitar) {
    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar) i.next();
      //Ignore serial number since that's unique
      //Ignore price since that's unique

      if (searchGuitar.getBuilder() != guitar.getBuilder())
        continue;
      String model = searchGuitar.getModel().toLowerCase();
      if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel().toLowerCase())))
        continue;

      if (searchGuitar.getType() != guitar.getType())
        continue;

      if (searchGuitar.getBackWood() != guitar.getBackWood())
        continue;
      if (searchGuitar.getTopWood() != guitar.getTopWood())
        continue;
      return guitar;
    }
    return null;
  }
}
