package vttp.ssf.day13wkshop.Models;

public class Task {
    
    private String taskName;
    private String priority;
    private String date;

    public String getTaskName() {return taskName;}
    public void setTaskName(String taskName) {this.taskName = taskName;}
   
    public String getPriority() {return priority;}
    public void setPriority(String priority) {this.priority = priority;}
    
    public String getDate() {return date;}
    public void setDate(String date) {this.date = date;}
    
    @Override
    public String toString() {
        return "Task [taskName=" + taskName + ", priority=" + priority + ", date=" + date + "]";
    }

    
}
