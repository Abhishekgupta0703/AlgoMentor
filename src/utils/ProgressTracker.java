package utils;

import main.Task;
import java.util.HashSet;
import java.util.Set;

public class ProgressTracker {
    private Set<Task> completedTasks;

    public ProgressTracker() {
        completedTasks = new HashSet<>();
    }

    // Mark a task as completed
    public void completeTask(Task task) {
        completedTasks.add(task);
        System.out.println("Task completed: " + task.getName());
    }

    // This should be addTask() instead of completeTask() if you want to follow the naming
    public void addTask(Task task) {
        completeTask(task);  // Calls the completeTask() method for consistency
    }

    // Display progress (completed tasks)
    public void displayProgress() {
        if (completedTasks.isEmpty()) {
            System.out.println("No tasks completed yet.");
        } else {
            System.out.println("Completed tasks:");
            for (Task task : completedTasks) {
                System.out.println(task);
            }
        }
    }
}
