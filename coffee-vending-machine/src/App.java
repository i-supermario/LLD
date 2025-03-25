import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

      Scanner scanner = new Scanner(System.in);

      CoffeeMachine machine = new CoffeeMachine(new HashMap<>(), new HashMap<>());
      do {
        machine.displayMenu();
        System.out.println("Choose coffee:");
        String input = scanner.nextLine();
        if(machine.dispenseCoffee(Integer.parseInt(input)-1)){
          System.out.println("Coffee will dispense...");
          Coffee item = machine.getItem(Integer.parseInt(input)-1);
          System.out.printf("Please pay $%d!\n", item.getPrice());
          Payment payment = new Payment(item.getName(), (float)item.getPrice());
          payment.setPaid(true);
          System.out.println("Payment done!");
        }
        else{
          System.out.println("Coffee unavailable!");
        }

      } while (true);

    }
}
