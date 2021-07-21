package Modul3;

/**
 * Created by &[User] and &[Date].
 */
public class TaskApp {
    public static void main(String[] args) {
        Task task = new Task("Complete modul 3 " , 2021,07,19);
        Task task1 = new Task("Complete modul 4 " , 2021,07,20);
        Task task2 = new Task("Complete modul 5 " , 2021,07,22);
        Task task3 = new Task("Complete modul 6 " , 2021,07,28);
        Task task4 = new Task("Complete modul 7 " , 2021,07,29);
        Task task5 = new Task("Repeat all modules 1-8 " , 2021,07,30);

        ToDoList toDoList = new ToDoList();
        toDoList.addTask(task);
        toDoList.addTask(task5);
        toDoList.addTask(task2);
        toDoList.addTask(task3);
        toDoList.addTask(task4);
        toDoList.addTask(task1);

        toDoList.showAllTaskToDO();

        toDoList.markCompletedTask();
        toDoList.markCompletedTask();
        System.out.println("_____________________");
        System.out.println("___TASK COMPLETED___");
        toDoList.showAllCompletedTask();
        System.out.println("___TASK TO DO___");
        toDoList.showAllTaskToDO();

    }
}
