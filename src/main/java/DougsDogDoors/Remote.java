package DougsDogDoors;

import java.util.Timer;
import java.util.TimerTask;

/*
Added schedule for auto close door.
 */
public class Remote {

  private DogDoor door;

  public Remote(DogDoor door) {
    this.door = door;
  }

  public void pressButton(){
    System.out.println("Pressing the remote control button");
    if (door.isOpen()){
      door.close();
    }else {
      door.open();
      /*
        made it final because we need to access cancel() in the TimerTask anonymous class.
        Also Time quite automatically after running the TimerTask but
        JVMs take forever before they garbage collect the timer. It can be hours. So we can use cancel() manually.

       */
      final Timer timer = new Timer();
      timer.schedule(new TimerTask() {
        @Override
        public void run() {
          door.close();
          timer.cancel();
        }
      },5000);
    }
  }
}
