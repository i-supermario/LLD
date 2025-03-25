public class Parking {

  boolean isAvailable;
  VehicleType t;
  private Payment payment;

  Parking(VehicleType t){
    isAvailable = true;
    this.t = t;
    payment = new Payment(VehicleType.CAR); 
  }

  void park(){
    isAvailable = false;
    payment.startTransaction();
    return;
  }

  double releaseSpot(){
    isAvailable = false;
    payment.endTransaction();
    return payment.calculateAmount();
  }
  
}
