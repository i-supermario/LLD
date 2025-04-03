public class ATM {

  private String location;
  private int totalAvailableCash;
  private Dispenser dispenser;
  private BankingService service;
  private AuthManager authManager;

  ATM(String l, int t){

    location = l;
    totalAvailableCash = t;
    dispenser = new Dispenser();
    service = BankingService.getInstance();
    authManager = AuthManager.getInstance();
  }

  public void deposit(int cardNumber, int pin, int amount){

    if(authManager.isValid(cardNumber, pin)){

      Card c = service.getCard(cardNumber);
      Account a = service.getAccount(c.getAccountNumber());
      a.deposit(amount);

    }

  }

  public void withdraw(int cardNumber, int pin, int amount){

    if(authManager.isValid(cardNumber, pin)){

      Card c = service.getCard(cardNumber);
      Account a = service.getAccount(c.getAccountNumber());
      if(a.withdraw(amount)) dispenser.dispenseCash();

    }

  }


  
}
