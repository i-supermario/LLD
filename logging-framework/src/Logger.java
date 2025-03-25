public class Logger {
  
  private static Logger instance = null;
  private Config config;

  private Logger() {
    config = new Config();
  };

  public static Logger getInstance() {
    if(instance == null){
      instance = new Logger();
    }
    return instance;
  }

  public Config getConfig(){
    return config;
  }

  public void log(String message){
    LogMessage m = new LogMessage(config.level, message);
    OutputType o = config.getOut();

    o.logMessageTo();
    m.log();
  } 

}
