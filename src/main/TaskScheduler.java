package main;

import java.util.ArrayList;
import java.util.List;

public class TaskScheduler {
    private List<Task> tasks;

    public TaskScheduler() {
        tasks = new ArrayList<>();
    }

    // Add task to the schedule
    public void addTask(Task task) {
        tasks.add(task);
    }

    // Get all tasks (this method is essential to avoid the 'cannot find symbol' error)
    public List<Task> getTasks() {
        return tasks;
    }

    // Display all tasks
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }
}
