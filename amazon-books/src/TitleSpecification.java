public class TitleSpecification implements Specification {
  
  @Override
  public boolean isValid(SearchParam s, Book b) {
    if(s.title != null){
      return b.getName().contains(s.title);
    }
    return true;
  }

}
