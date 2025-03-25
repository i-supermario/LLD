public class Record implements IRecord {

  private String name;
  private byte[] content;

  Record(String n, byte[] c){
    name = n;
    content = c;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getExtension() {
    return name.substring(name.indexOf('.')+1);
  }

  @Override
  public int getSize() {
    // TODO Auto-generated method stub
    return content.length;
  }

  public byte[] getContent() {
    return content;
  }
  
}
