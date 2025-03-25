import java.util.Date;

public class LogMessage{
  
  private Date timestamp;
  private LogLevel level;
  private String message;

  LogMessage(LogLevel l, String m){
    timestamp = new Date();
    level = l;
    message = m;

  }

  void log(){
    System.out.printf("\n Timestamp: %s \n Level: %s \n Message: %s \n", timestamp.toString(), level.toString(), message);
  }



}