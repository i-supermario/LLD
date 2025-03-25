import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

      FileSystem fs = new FileSystem();
      Record r = new Record("abc.ppt", "abc.ppt".getBytes());
      fs.addFile(r);
      r = new Record("ayz.xml", "ayz.xml".getBytes());
      fs.addFile(r);
      r = new Record("tbh.exe", "tbh.exe".getBytes());
      fs.addFile(r);

      List<Record> results = fs.search(
        new SearchParams().setExtension("exe").setMaxSize(6).setName("ayz.xml")
      );

      for(Record rec: results) System.out.println(rec.getName());

    }
}
