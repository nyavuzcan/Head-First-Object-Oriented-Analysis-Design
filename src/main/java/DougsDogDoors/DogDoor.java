package DougsDogDoors;
/*
Customer doesnt want to open and close ; they want automatically close after open some seconds
Also they want to some requirements for this app.
 */
public class DogDoor {
  private boolean open;

  public DogDoor() {
    this.open = false;
  }

  public void open(){
    System.out.println("The dog door opens");
    open = true;
  }

  public void close(){
    System.out.println("The dog door closes");
    open = false;
  }

  public boolean isOpen(){
    return open;
  }
}
