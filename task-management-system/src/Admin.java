import java.util.Date;
import java.util.Scanner;

public class Admin extends User {

  Admin(String n) {
    super(n);
  }

  public Task createTask(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Task name: ");
    String name = sc.nextLine();
    System.out.println("Task description: ");
    String description = sc.nextLine();

    Task t = new Task(name, description, Priority.LOW, Status.INACTIVE, new Date());

    sc.close();
    
    return t;
  }

  
}
