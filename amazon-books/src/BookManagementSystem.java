import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookManagementSystem {

  private int userId = 0;
  private int bookId = 0;

  
  List<Book> store;
  List<Normie> normies;
  List<Admin> admins;
  List<Order> orders;

  BookManagementSystem(){
    store = new ArrayList<>();
    normies = new ArrayList<>();
    admins = new ArrayList<>();
    orders = new ArrayList<>();
  }

  Normie createNormie(String name, String email){
    Normie n = new Normie(name, email, userId++);
    normies.add(n);
    return n;
  }

  Admin createAdmin(String name, String email){
    Admin a = new Admin(name, email, userId);
    admins.add(a);
    return a;
  }

  List<Book> search(SearchParam sp, Specification s){
    Map<Integer,Book> result = new HashMap<>();
    for(int i=0;i<store.size();i++){
      if(s.isValid(sp, store.get(i))) result.put(i,store.get(i));
    }

    System.out.println("Search Result:");
    for(Map.Entry<Integer, Book> entry: result.entrySet()){
      System.out.printf("\n%d: %s", entry.getKey(), entry.getValue().getName());
    }

    return new ArrayList<>(result.values());
  }

  Order createOrder(Normie n){
    Order o = new Order(n.userId);
    return o;
  }

  int checkout(Order o){
    o.checkout();
    return o.getTotal();
  }

  void addBooksToInventory(Book b){
    b.addId(bookId);
  }

  void removeBooksFromInventory(Book b){
    store.remove(b);
  }

  void writeReview(Book b, Normie n, String text){
    b.addReview(new Review(n.userId, b.getBookId()).setText(text));
  }

  void giveRating(Book b, Normie n, int stars){
    b.addRatings(new Rating(n.userId, b.getBookId()).rate(stars));
  }






}
