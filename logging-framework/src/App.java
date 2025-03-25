public class App {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getInstance();
        logger.getConfig().setLevel(LogLevel.DEBUG).setOut(new ConsoleOut());
        logger.log("Yo this is working or not?");

    }
}
