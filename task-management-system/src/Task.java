import java.util.Date;

public class Task {

  String title;
  String description;
  User assignedTo;
  User assignedBy;
  Priority priority;
  Status status;
  Date deadline;

  Task(String t, String d, Priority p, Status s, Date deadline){
    this.title = t;
    this.description = d;
    this.priority = p;
    this.status = s;
    this.deadline = deadline;
  }
  
  public void assignTaskTo(User assigner, User assignee){
    this.assignedTo = assignee;
    this.assignedBy = assigner;
  }

  public void markComplete(){
    this.status = Status.COMPLETED;
  }

  public void cupdatePriority(Status s){ this.status = s; }
  public void updateTitle(String t) { this.title = t; };
  public void updateDescription(String d) { this.description = d; };
  public void updateDeadline(Date d) { this.deadline = d; };

  public void displayTaskDetails(){

    System.out.println("Task Details:\n");
    System.out.printf("Name: %s \n", this.title);
    System.out.printf("Description: %s \n", this.description);
    System.out.printf("Assigned By: %s \n", this.assignedBy.name);
    System.out.printf("Assigned To: %s \n", this.assignedTo.name);
    System.out.printf("Priority: %s \n", this.priority.toString());
    System.out.printf("Status: %s \n", this.status.toString());
    System.out.printf("Deadline: %s \n", this.deadline.toString());

  }
  
}
