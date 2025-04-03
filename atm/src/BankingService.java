import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BankingService {

  private static BankingService instance;
  private AuthManager authManager;

  Map<Integer, Card> cards;
  Map<Integer, Account> accounts;

  private BankingService(){
    accounts = new HashMap<>();
    cards = new HashMap<>();
  }

  public static BankingService getInstance() {
    if(instance == null){
      instance = new BankingService();
    }
    return instance;
  }

  public void addNewAccount(int accountNumber){

    Account a = new Account(accountNumber, new Date());
    accounts.put(accountNumber, a);

  }

  public void addNewCard(int accountNumber, Card c){

    Account a = getAccount(accountNumber);
    a.addCard(c);
    cards.put(c.getCardNumber(), c);
    authManager.addCredentials(c.getCardNumber(), c.getPin());
  }
  
  public Card getCard(int cardNumber){
    return cards.get(cardNumber);
  }

  public Account getAccount(int accountNumber){
    return accounts.get(accountNumber);
  }


  
}
