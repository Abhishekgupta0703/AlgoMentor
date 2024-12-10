package data;

import main.Task;
import java.util.ArrayList;
import java.util.List;

public class MockTaskData {
    public static List<Task> getMockTasks() {
        List<Task> tasks = new ArrayList<>();

        // Core Java for Beginners with priority
        tasks.add(new Task("Understand Data Types in Java", "Core Java", "Beginner", 1)); // Priority 1
        tasks.add(new Task("Learn Control Flow (if-else, switch-case)", "Core Java", "Beginner", 1));
        tasks.add(new Task("Practice Loops (for, while)", "Core Java", "Beginner", 2)); // Priority 2

        // DSA for Intermediate Learners
        tasks.add(new Task("Learn and Implement Stacks", "Data Structures", "Intermediate", 3));
        tasks.add(new Task("Learn and Implement Queues", "Data Structures", "Intermediate", 3));

        // Advanced DSA Topics
        tasks.add(new Task("Master Dynamic Programming (DP) Problems", "Data Structures", "Advanced", 4));

        // Project-Based Learning
        tasks.add(new Task("Build a Simple Calculator in Java", "Projects", "Beginner", 2));
        tasks.add(new Task("Create a To-Do List App using Core Java", "Projects", "Intermediate", 3));

        return tasks;
    }
}
