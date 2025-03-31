abstract class Light{

  private boolean status;
  private int duration;
  Light(){
    status = false;
    duration = 20;
  }

  void on(){
    status = true;
  }

  void off(){
    status = false;
  }

  public void setDuration(int d) {
    this.duration = d;
  }

  public int getDuration() {
    return duration;
  }

  public int getDurationInMilliSeconds(){
    return duration * 1000;
  }



}