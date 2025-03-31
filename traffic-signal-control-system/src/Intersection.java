public class Intersection {

  Signal north;
  Signal south;
  Signal east;
  Signal west;

  Intersection(){
    north = new Signal("north");
    south = new Signal("south");
    east = new Signal("east");
    west = new Signal("west");

  }

  void setStandardRoutine(){

    new Thread(() -> {
      // try {
        north.execute();
        // Thread.sleep(25000);
      // } catch (InterruptedException e) {
      //   // TODO Auto-generated catch block
      //   e.printStackTrace();
      // }
    }).start();

    new Thread(() -> {
      // try {
        west.execute();
        // Thread.sleep(25000);
      // } catch (InterruptedException e) {
      //   // TODO Auto-generated catch block
      //   e.printStackTrace();
      // }
    }).start();

    new Thread(() -> {
      // try {
        east.execute();
        // Thread.sleep(25000);
      // } catch (InterruptedException e) {
      //   // TODO Auto-generated catch block
      //   e.printStackTrace();
      // }
    }).start();
    
    new Thread(() -> {
      // try {
        south.execute();
        // Thread.sleep(25000);
      // } catch (InterruptedException e) {
      //   // TODO Auto-generated catch block
      //   e.printStackTrace();
      // }
    }).start();


    
  }

  void emergency(){
    north.Stop();
    south.Stop();
    east.Stop();
    west.Stop();
  }
  
}
