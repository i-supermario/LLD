public class Review {
  int userId;
  int bookId;
  String text;

  Review(int u, int b){
    userId = u;
    bookId = b;
    text = null;
  }

  public String getText() {
    return text;
  }

  public Review setText(String text) {
    this.text = text;
    return this;
  }

}
