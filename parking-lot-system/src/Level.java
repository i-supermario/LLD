import java.util.HashMap;
import java.util.Map;

public class Level {
  
  int spotsAvailable;
  Map<VehicleType, Integer> availabilityMap;
  Map<Vehicle, Parking> parkedVehicles;

  Level(){
    initDefault();
  }

  private void initDefault(){

    spotsAvailable = 30;

    availabilityMap = new HashMap<>();
    availabilityMap.put(VehicleType.CAR, 10);
    availabilityMap.put(VehicleType.MOTORCYCLE, 10);
    availabilityMap.put(VehicleType.TRUCK, 10);

    parkedVehicles = new HashMap<>();

  }

  boolean assignParking(Vehicle v){

    if(!isSpotAvailable(v.vehicleType)) return false;
    spotsAvailable -= 1;
    availabilityMap.put(v.vehicleType, availabilityMap.get(v.vehicleType) - 1);
    Parking p = new Parking(v.vehicleType);
    p.park();
    parkedVehicles.put(v, p);
    v.park();
    return true;

  }

  boolean isSpotAvailable(VehicleType t){
    if(spotsAvailable==0) return false;
    if(availabilityMap.get(t)==0) return false;
    return true;
  }

  double releaseParking(Vehicle v){

    if(spotsAvailable==30) return -1;
    spotsAvailable += 1;
    availabilityMap.put(v.vehicleType, availabilityMap.get(v.vehicleType) + 1);

    Parking p = parkedVehicles.get(v);
    parkedVehicles.remove(v);
    v.unpark();

    return p.releaseSpot();
  }

}
