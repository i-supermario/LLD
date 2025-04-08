import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class ElevatorSystem {

  List<Elevator> elevators;
  int minFloor;
  int maxFloor;

  ElevatorSystem(){
    elevators = new ArrayList<>();
    minFloor = 0;
    maxFloor = 10;
  }

  void addElevator(int id, int capacity){
    Elevator e = new Elevator(id, capacity, minFloor, maxFloor);
    elevators.add(e);
    return;
  }

  Elevator callElevatorFrom(int floor){

    PriorityQueue<int[]> q = new PriorityQueue<>((a,b) -> a[1] - b[1]);
    for(int i=0;i<elevators.size();i++){
      if(elevators.get(i).getStatus() == Status.SERVING) continue;
      q.offer(new int[]{i, Math.abs(i - elevators.get(i).getCurrentFloor()) });
    }

    Elevator a = elevators.get(q.poll()[0]);
    a.setStatus(Status.SERVING);
    a.goToFloor(floor);
    return a;
  }


  
}
