public class AndSpecification implements Specification {

  Specification one;
  Specification two;

  AndSpecification(Specification o, Specification t){
    one = o;
    two = t;
  }

  @Override
  public boolean isValid(SearchParam s, Book b) {
    return one.isValid(s, b) && two.isValid(s, b);
  }
  
}
