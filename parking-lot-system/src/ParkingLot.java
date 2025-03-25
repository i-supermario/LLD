import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {

  List<Level> levels;
  Map<String, Vehicle> vehicleRegister;
  Map<String, Level> parkedVehicles;


  ParkingLot(){
    levels = new ArrayList<>();
    parkedVehicles = new HashMap<>();
    vehicleRegister = new HashMap<>();
    init();
  }

  private void init(){
    levels.add(new Level());
    levels.add(new Level());
    levels.add(new Level());
  }

  boolean parkVehicle(Vehicle v){
    if(parkedVehicles.containsKey(v.namePlate)) return true;
    vehicleRegister.put(v.namePlate, v);
    for(Level l: levels){
      if(l.assignParking(v)){
        parkedVehicles.put(v.namePlate, l);
        return true;
      }
    }
    return false;
  }

  double unparkVehicle(String namePlate){

    if(!parkedVehicles.containsKey(namePlate)) return -1;
    double amount = parkedVehicles.get(namePlate).releaseParking(vehicleRegister.get(namePlate));
    if(amount != -1){
      parkedVehicles.remove(namePlate);
      return amount;
    }

    return -1;
  }
  
}
