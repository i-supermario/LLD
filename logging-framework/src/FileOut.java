public class FileOut implements OutputType {
  
  FileOut(){}
  
  @Override
  public void logMessageTo() {
    System.out.println("File");
  }

}
