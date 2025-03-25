abstract class Vehicle {
  public VehicleType vehicleType;
  String namePlate;
  boolean isParked;

  Vehicle(VehicleType t, String namePlate){
    this.vehicleType = t;
    this.namePlate = namePlate;
    this.isParked = false;
  }

  boolean isParked(){
    return isParked;
  }
  

  void park(){
    isParked = true;
    return;
  }

  void unpark(){
    isParked = false;
    return;
  }

}

class Car extends Vehicle {
  
  Car(String namePlate){
    super(VehicleType.CAR, namePlate);
  }

}

class MotorCycle extends Vehicle {
  
  MotorCycle(String namePlate){
    super(VehicleType.MOTORCYCLE, namePlate);
  }

}

class Truck extends Vehicle {
  
  Truck(String namePlate){
    super(VehicleType.TRUCK, namePlate);
  }

}


