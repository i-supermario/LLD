public class AuthorSpecification implements Specification {
  
  @Override
  public boolean isValid(SearchParam s, Book b) {
    if(s.author != null){
      return b.getAuthor().contains(s.author);
    }
    return true;
  }
  
  
}
