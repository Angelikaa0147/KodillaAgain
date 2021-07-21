package Modul3;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * Created by &[User] and &[Date].
 */
public class ToDoList {

    private ArrayDeque<Task> toDoList ;
    private ArrayList<Task> completedTask ;

    //konstruktor
    public ToDoList(){
        toDoList=new ArrayDeque<Task>();
        completedTask=new ArrayList<Task>();
    }

    public void addTask (Task task){
        toDoList.offerLast(task);
        System.out.println("Task added to list");
    }

    public void markCompletedTask() {
        if (toDoList.size() > 0) {
            Task temp = toDoList.peekFirst();
            completedTask.add(temp);
            toDoList.pollFirst();
            System.out.println("Task " + temp.toString() + " completed");
        }else System.out.println("There is no task to do");
    }

    public void showAllTaskToDO(){
        int counter =0;
        for(Task t : toDoList){
            counter++;
            System.out.println("Task no " + counter +" "+ t.toString());
        }
    }

    public void showAllCompletedTask(){
        int counter=0;
        for(Task t : completedTask){
            counter++;
            System.out.println("Task no " + counter+" " + t.toString());
        }
    }

}
