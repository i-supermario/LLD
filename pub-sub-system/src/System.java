import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class System {

  public static Object out;
  Map<String, Topic> topics;

  System(){

    topics = new ConcurrentHashMap<>();

  }

  Topic createTopic(String name){
    Topic t = new Topic(name);
    topics.put(name, t);
    return t;
  }

  void publish(String topic,String message){
    topics.get(topic).publish(message);
    return;
  }

  void subscribe(String topic, Subscriber s){
    topics.get(topic).subscribe(s);
    return;
  }

  void unsubscribe(String topic, Subscriber s){
    topics.get(topic).unsubscribe(s);
    return;
  }
  
}
