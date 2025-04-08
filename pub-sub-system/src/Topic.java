import java.util.ArrayList;
import java.util.List;

public class Topic {

  String name;
  List<Subscriber> subscriberList;
  List<Publisher> publisherList;

  Topic(String n){

    name = n;
    subscriberList = new ArrayList<>();
    publisherList = new ArrayList<>();

  }

  void subscribe(Subscriber u){
    subscriberList.add(u);
  }

  void unsubscribe(Subscriber u){
    subscriberList.remove(u);
  }

  void publish(String message){
    for(Subscriber s: subscriberList){
      s.notifyUser(message);
    }
  }
  
}
