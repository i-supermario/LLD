import static java.lang.System.out;


public class Subscriber extends User{

  Subscriber(int userId){
    super(userId);
  }

  void notifyUser(String message){
    
    out.printf("\n %d: %s", userId, message);

  }
  
}
