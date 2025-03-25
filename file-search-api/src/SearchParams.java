import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SearchParams {
  
  private String extension = null;
  private int minSize = -1;
  private int maxSize = -1;
  private String name = null;



  SearchParams(){
    
  }

  public SearchParams setExtension(String extension) {
    this.extension = extension;
    return this;
  }

  public SearchParams setMaxSize(int maxSize) {
    this.maxSize = maxSize;
    return this;
  }

  public SearchParams setMinSize(int minSize) {
    this.minSize = minSize;
    return this;
  }

  public SearchParams setName(String name) {
    this.name = name;
    return this;
  }

  List<Record> filtered(List<Record> records){

    Set<Record> result = new HashSet<>();

    if(extension != null){
      for(Record r: records){
        if(r.getExtension().equals(extension)){
          result.add(r);
        }
      }
    }

    if(minSize != -1 && maxSize != -1){
      for(Record r: records){
        if(r.getSize() >= minSize && r.getSize() <= maxSize){
          result.add(r);
        }
      }
    }
    else if(minSize != -1){
      for(Record r: records){
        if(r.getSize() >= minSize){
          result.add(r);
        }
      }
    }
    else if (maxSize != -1) {
      for(Record r: records){
        if(r.getSize() <= maxSize){
          result.add(r);
        }
      }
    }

    if(name != null){

      for(Record r: records){
        if(r.getName().equalsIgnoreCase(name)){
          result.add(r);
        }
      }

    }

    return new ArrayList<>(result);

  }

}
