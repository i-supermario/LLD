public class MaxPriceSpecification implements Specification{
  @Override
  public boolean isValid(SearchParam s, Book b) {
    if(s.maxPrice != -1){
      return b.getPrice() <= s.maxPrice;
    }
    return true;
  }
}
