public class Signal {

  GreenLight g;
  RedLight r;
  YellowLight y;

  String name;
  

  Signal(String n){

    name = n;
    g = new GreenLight();
    r = new RedLight();
    y = new YellowLight();

  }

  void Go(){
    r.off();
    y.off();
    g.on();
    System.out.printf("\n Signal Direction: %s \n Go \n", name);
  }

  void Wait(){
    r.off();
    g.off();
    y.on();
    System.out.printf("\n Signal Direction: %s \n Wait \n", name);
  }

  void Stop(){
    g.off();
    y.off();
    r.on();
    System.out.printf("\n Signal Direction: %s \n Stop \n", name);
  }

  void execute(){

    while (true) {
      try {
        Go();
        Thread.sleep(g.getDurationInMilliSeconds());
        Wait();
        Thread.sleep(y.getDurationInMilliSeconds());
        Stop();
        Thread.sleep(r.getDurationInMilliSeconds());
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

  }


  
}
