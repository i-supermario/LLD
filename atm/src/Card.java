public class Card {

  private int accountNumber;
  private int cardNumber;
  private int cv;
  private int pin;

  Card(int an, int cn, int p, int c){
    accountNumber = an;
    cardNumber = cn;
    pin = p;
    cv = c;
  }

  public int getCardNumber() {
    return cardNumber;
  }

  public int getPin() {
    return pin;
  }

  public int getCv() {
    return cv;
  }

  public int getAccountNumber() {
    return accountNumber;
  }
    
}
