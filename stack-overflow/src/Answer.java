import java.util.ArrayList;

public class Answer extends Template {

  int questionId;

  Answer(int id, int questionId, String text){

    super(id, text);
    this.questionId = questionId;

  }
  
}
