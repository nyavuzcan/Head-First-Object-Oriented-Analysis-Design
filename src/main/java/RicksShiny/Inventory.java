package RicksShiny;

import java.util.ArrayList;
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
    Guitar guitar = new Guitar(serialNumber, price , new GuitarSpec( builder, type,model, backWood, topWood));

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
  /*
  Customer want to list of searched guitars
   */
  /*
  !!!! In here Guitar two null field for using search. So we can use anathor OBject for searchin GuitarSpec. But in here
  seperate two class have many duplicate  code : getWood, getBuilder. So we can use encapsulate
   */
  public List search(GuitarSpec searchSpec) {
    List matchingGuitars = new ArrayList();
    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar) i.next();
      //Ignore serial number since that's unique
      //Ignore price since that's unique
      GuitarSpec guitarSpec = guitar.getGuitarSpec();
      if (searchSpec.getBuilder() != guitarSpec.getBuilder())
        continue;
      String model = searchSpec.getModel().toLowerCase();
      if ((model != null) && (!model.equals("")) && (!model.equals(guitarSpec.getModel().toLowerCase())))
        continue;

      if (searchSpec.getType() != guitarSpec.getType())
        continue;

      if (searchSpec.getBackWood() != guitarSpec.getBackWood())
        continue;
      if (searchSpec.getTopWood() != guitarSpec.getTopWood())
        continue;
      matchingGuitars.add(guitar);
    }
    return matchingGuitars;
  }
}
