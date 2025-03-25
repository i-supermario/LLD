public class Config {

  LogLevel level;
  OutputType out;

  Config(){};

  public Config setLevel(LogLevel l) {
    this.level = l;
    return this;
  }

  public Config setOut(OutputType o){
    this.out = o;
    return this;
  }

  public LogLevel getLevel() {
    return level;
  }

  public OutputType getOut() {
    return out;
  }
  
}
