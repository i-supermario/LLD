import java.util.Scanner;

public class TMS {

  private TMS instance;

  TMS(){
    instance = new TMS();
  }

  public TMS getInstance() {
    if(instance == null){
      instance = new TMS();
    }
    return instance;
  }

  public User createAdmin(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Admin name:");
    String name = sc.nextLine();
    
    Admin a = new Admin(name);
    return a;
  }
  
}
