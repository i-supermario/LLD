import java.util.ArrayList;
import java.util.List;

public class FileSystem {

  private List<Record> storage;
  FileSystem(){
    storage = new ArrayList<>();
  }

  public void addFile(Record r){
    storage.add(r);
  }

  public void removeFile(Record r){
    storage.remove(r);
  }

  public List<Record> search(SearchParams s){
    
    return s.filtered(storage);

  }

  
  
}
