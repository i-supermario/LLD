public class Admin implements IUser{
  String name;
  String email;
  int userId;
  UserType type;

  Admin(String n, String e, int id){
    name = n;
    email = e;
    userId = id;
    type = UserType.ADMIN;
  }



}
