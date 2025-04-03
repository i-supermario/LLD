import java.util.HashMap;
import java.util.Map;

public class AuthManager {

  private static AuthManager instance;
  private Map<Integer, Integer> map;
  private AuthManager(){
    map = new HashMap<>();
  }

  public static AuthManager getInstance() {
    if(instance == null){

      instance = new AuthManager();

    }
    return instance;
  }

  public void addCredentials(int cardNumber, int pin){

    map.put(cardNumber, pin);

  }

  public boolean isValid(int cardNumber, int pin){

    if(!map.containsKey(cardNumber)) return false;
    if(map.get(cardNumber) == pin) return true;
    return false;

  }

  
}
