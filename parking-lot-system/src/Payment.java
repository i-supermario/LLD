public class Payment {

  VehicleType t;
  double perHourRate;
  boolean isPaid;
  int startTime;
  int endTime;

  Payment(VehicleType t){

    this.t = t;
    this.perHourRate = t == VehicleType.CAR ? 10 : t == VehicleType.MOTORCYCLE ? 5 : 15;
    this.isPaid = false;
    this.startTime = 0;
    this.endTime = 0;

  }

  void startTransaction(){
    startTime = (int) System.currentTimeMillis();
  }

  void endTransaction(){
    endTime = (int) System.currentTimeMillis();
  }

  double calculateAmount(){
    if(endTime == 0 || startTime == 0) return 0;    
    return (endTime - startTime) * perHourRate;
  }

  void makePayment(){
    isPaid = true;
  }
  
}
