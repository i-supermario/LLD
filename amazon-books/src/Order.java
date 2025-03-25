import java.util.ArrayList;
import java.util.List;

public class Order {
  
  int userId;
  List<Book> books;
  OrderStatus status;

  Order(int u){
    userId = u;
    books = new ArrayList<>();
    status = OrderStatus.BUILDING;
  }

  Order addToOrder(Book b){
    books.add(b);
    return this;
  }

  int getTotal(){
    int total = 0;
    for(Book b: books){
      total += b.getPrice();
    }
    return total;
  }

  Order removeFromOrder(Book b){
    books.remove(b);
    return this;
  }

  void checkout(){
    status = OrderStatus.PLACED;
  }

}
