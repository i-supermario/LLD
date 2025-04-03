import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {

  private int accountNumber;
  private Date createdAt;
  private long balance;
  private List<Transaction> transactions;
  private List<Card> cards;

  Account(int an, Date d){
    accountNumber = an;
    balance = 0;
    transactions = new ArrayList<>();
    cards = new ArrayList<>();
    createdAt = d;
  }

  public long getBalance() {
    return balance;
  }

  public List<Transaction> getTransactionHistory() {
    return transactions;
  }

  public void addCard(Card a){
    cards.add(a);
  }

  public void deposit(int amount){

    balance += amount;
    transactions.add(new Deposit(amount, new Date()));

  }

  public boolean withdraw(int amount){

    if(balance < amount) return false;
    transactions.add(new Withdrawal(amount, new Date()));

    return true;
  }
  
}