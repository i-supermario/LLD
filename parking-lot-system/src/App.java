import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
      ParkingLot parkingLot = new ParkingLot();
      Scanner sc = new Scanner(System.in);
      do {

        System.out.println("1. Park Vehicle");
        System.out.println("2. Unpark Vehicle");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(sc.nextLine());
        String namePlate;

        switch (choice) {
          case 1:
            System.out.print("Enter vehicle name plate: ");
            namePlate = sc.nextLine();
            System.out.print("Enter vehicle type: ");
            String type = sc.nextLine().toLowerCase();
            
            Vehicle v = type == "car" ? new Car(namePlate) : type == "motorcycle" ? new MotorCycle(namePlate) : new Truck(namePlate);
            if(parkingLot.parkVehicle(v)){
              System.out.println("Vehicle parked successfully!");
            } else {
              System.out.println("Parking full!");
            }
            break;
          case 2:
            System.out.print("Enter vehicle name plate: ");
            namePlate = sc.nextLine();
            
            double amount = parkingLot.unparkVehicle(namePlate);
            if(amount != -1){
              System.out.println("Vehicle unparked successfully! Amount to be paid: " + amount);
            } else {
              System.out.println("Vehicle not found!");
            }
            break;
          case 3:
            System.exit(0);
            break;
          default:
            System.out.println("Invalid choice!");
            break;
        }
        
      } while (true);

    }
}
