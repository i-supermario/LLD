import java.util.ArrayList;
import java.util.List;

public abstract class Template {
  
  int id;
  String text;
  List<Tags> tags;
  int votes;

  Template(int id, String text){

    this.id = id;
    this.text = text;
    votes = 0;

  }

  private void setVotes(int votes) {
    this.votes = votes;
  }

  Template upVote(){

    this.votes++;
    return this;

  }

  Template downVote(){

    this.votes--;
    return this;

  }

}
