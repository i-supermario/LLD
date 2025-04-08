public class App {
    public static void main(String[] args) throws Exception {
      System pubsub = new System();
      Subscriber a = new Subscriber(0);
      Subscriber b = new Subscriber(1);

      pubsub.createTopic("cricket");
      pubsub.createTopic("football");

      pubsub.subscribe("cricket", b);
      pubsub.subscribe("cricket", a);
      pubsub.subscribe("football", a);

      pubsub.publish("cricket", "Kohli Out");
      pubsub.publish("football", "Messi out");


    }
}
