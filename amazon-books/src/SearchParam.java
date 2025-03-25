public class SearchParam {

  String title = null;
  String author = null;
  int minPrice = -1;
  int maxPrice = -1;


  SearchParam(){}

  SearchParam addTitle(String t){
    title = t;
    return this;
  }

  SearchParam addAuthor(String a){
    author = a;
    return this;
  }

  SearchParam addMinPrice(int p){
    minPrice = p;
    return this;
  }

  SearchParam addMaxPrice(int p){
    maxPrice = p;
    return this;
  }

}
