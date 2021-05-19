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

    try{
      Thread.sleep(10000);
    }catch (InterruptedException e){
      System.out.println(e);
    }
    System.out.println("... but he's stuck outside!");
    System.out.println("\n Fido starts barking....");
    System.out.println("... so Gina grabs the remote control.");
    remote.pressButton();
    System.out.println("\nFido's back inside....");

  }
}
