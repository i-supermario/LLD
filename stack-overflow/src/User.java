import java.util.List;

class User {

  int id;
  String name;
  String email;
  int score;
  List<Question> questions;
  List<Answer> answers;

  User(int id, String n, String e){
    this.id = id;
    this.name = n;
    this.email = e;
    this.score = 0;
  }

  Question createQuestion(String text){
    Question q = new Question(id, text);
    questions.add(q);
    return q;
  }

  void answerQuestion(Question q, String text){
    Answer a = q.addAnswer(text);
    answers.add(a);
  }


  
}