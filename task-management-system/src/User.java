import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class User{

  String name;
  UserType type;
  List<Task> taskList;

  User(String n){
    this.name = n;
    this.type = UserType.WORKER;
    this.taskList = new ArrayList<>();
  }

  void addToTaskList(Task t) { this.taskList.add(t); };

  void markComplete(Task t) { t.markComplete(); };

  void getTaskHistory(SortBy s){
    List<Task> result;
    if(s.equals(SortBy.ASSIGNEE)){
      result = taskList.stream().sorted((a,b) -> a.assignedTo.name.compareTo(b.assignedTo.name)).collect(Collectors.toList());
    }
    else if(s.equals(SortBy.DEADLINE)){
      result = taskList.stream().sorted((a,b) -> a.deadline.compareTo(b.deadline)).collect(Collectors.toList());
    }
    else if(s.equals(SortBy.PRIORITY)){
      result = taskList.stream().sorted((a,b) -> a.priority.compareTo(b.priority)).collect(Collectors.toList());
    }
    else{
      result = taskList.stream().sorted((a,b) -> a.status.compareTo(b.status)).collect(Collectors.toList());
    }

    result.forEach((Task t) -> t.displayTaskDetails());    
    

  }
  
}
