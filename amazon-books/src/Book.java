import java.util.ArrayList;
import java.util.List;

public class Book {
  
  private String name;
  private String author;
  private int price;
  private int bookId;
  private int stock;
  private List<Review> reviews;
  private List<Rating> ratings;

  Book(){
    reviews = new ArrayList<>();
    ratings = new ArrayList<>();
  }

  Book addName(String t){
    name = t;
    return this;
  }

  Book addAuthor(String t){
    author = t;
    return this;
  }

  Book addId(int t){
    bookId = t;
    return this;
  }

  Book addPrice(int t){
    price = t;
    return this;
  }

  Book addStock(int s){
    stock = s;
    return this;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }

  public String getAuthor() {
    return author;
  }

  public int getStock() {
    return stock;
  }

  public int getBookId() {
    return bookId;
  }

  void addReview(Review r){
    reviews.add(r);
    return;
  }

  void addRatings(Rating r){
    ratings.add(r);
    return;
  }

}
