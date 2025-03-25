public class ConsoleOut implements OutputType {
  
  ConsoleOut(){}

  @Override
  public void logMessageTo() {
    System.out.println("Console");
  }

}
