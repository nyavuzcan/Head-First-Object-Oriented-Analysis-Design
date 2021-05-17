package DougsDogDoors;

public class DogDoorSimulator {

  public static void main(String[] args) {
    DogDoor door = new DogDoor();
    Remote remote = new Remote(door);

    System.out.println("Fido barks to go outside....");
    remote.pressButton();
    System.out.println("\n Fide has gone outside...");
 // Auto closing.
    System.out.println("\n Fido's all done...");

    System.out.println("\nFido's back inside....");

  }
}
