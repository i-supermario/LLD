import java.util.Date;

public abstract class Transaction {
  
  int amount;
  Date date;

  Transaction(int a, Date d){
    amount = a;
    date = d;
  }

}
