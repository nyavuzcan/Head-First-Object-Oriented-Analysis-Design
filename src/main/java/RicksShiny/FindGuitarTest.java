package RicksShiny;

public class FindGuitarTest {

  public static void main(String[] args) {
//Set up Rick's aguitar inventory
    Inventory inventory = new Inventory();

    initilaizeInventory(inventory);

    Guitar whatErinLikes = new Guitar("", 0, "fender", "Stratocastor", "Electric",
        "Alder", "Alder");

    Guitar guitar = inventory.search(whatErinLikes);

    if (guitar != null) {
      System.out.println("Ering you might like this" +
          guitar.getBuilder() + " " + guitar.getModel() + " " +
          guitar.getType() + " guitar:\n   " + guitar.getBackWood() + " back and s,des, \n" + guitar.getTopWood() + " top.\nYou can " +
          "have it for only $" + guitar.getPrice() + "!");
    } else {
      System.out.println("Sorry, Erin, we have nothing for you.");
    }

  }

  private static void initilaizeInventory(Inventory inventory) {

    Guitar guitarTwo = new Guitar("532434", 0, "fender", "Stratocastor", "electric",
        "Alder", "Alder");


    inventory.addGuitar("123231", 0, "fender", "Stratocastor", "electric",
        "Alder", "Alder");

    inventory.addGuitar("V95693", 1499.95, "Fender", "Stratocastor", "electric",
        "Alder", "Alder");
  }
}
