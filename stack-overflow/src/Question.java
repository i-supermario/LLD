import java.util.ArrayList;
import java.util.List;

public class Question extends Template {

  List<Answer> answers;
  List<Tags> tags;
  int answerCount = 0;

  Question(int id, String text){
    super(id, text);
    tags = new ArrayList<>();
    answers = new ArrayList<>();

  }

  public Question setTags(List<Tags> tags) {
    this.tags = tags;
    return this;
  }

  public Answer addAnswer(String text){

    Answer a = new Answer(answerCount, id, text);
    return a;

  }

  public List<Answer> getAllAnswers(){
    return answers;
  }




}
