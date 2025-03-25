public class MinPriceSpecification implements Specification{
  
  @Override
  public boolean isValid(SearchParam s, Book b) {
    if(s.minPrice != -1){
      return b.getPrice() >= s.minPrice;
    }
    return true;
  }
  
  
}
