public class Rating {
  int userId;
  int bookId;
  int stars;

  Rating(int u, int b){
    userId = u;
    bookId = b;
    stars = -1;
  }

  Rating rate(int s){
    if(s < 0) stars = 0;
    else if(s > 5) stars = 5;
    else stars = s;

    return this;
  }
}
