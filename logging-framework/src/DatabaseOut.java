public class DatabaseOut implements OutputType {
  
  DatabaseOut(){}

  @Override
  public void logMessageTo() {
    System.out.println("Database");
  }

}
