import java.sql.Time;

public class Elevator {

  int id;
  int capacity;
  Status status;
  Direction direction;
  int currentFloor;
  int minFloor;
  int maxFloor;

  Elevator(int id, int c, int min, int max){
    this.id = id;
    capacity = c;
    minFloor = min;
    maxFloor = max;
    status = Status.IDLE;
    direction = Direction.UP;
    currentFloor = 0;
  }

  void goToFloor(int f){
    int time = currentFloor - f;
    new Thread();
    try {
      Thread.sleep(time*1000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    currentFloor = f;
    setStatus(Status.IDLE);
  }

  public int getCurrentFloor() {
    return currentFloor;
  }

  public Status getStatus() {
    return status;
  }

  public Direction getDirection() {
    return direction;
  }

  public void setStatus(Status status) {
    this.status = status;
  }
  
}
