public class Normie implements IUser {
  String name;
  String email;
  int userId;
  UserType type;

  Normie(String n, String e, int u){
    name = n;
    email = e;
    userId = u;
    type = UserType.NORMIE;
  }



  
}
