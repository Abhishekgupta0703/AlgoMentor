package main;

import data.MockTaskData;
import utils.ProgressTracker;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to AlgoMentor: Personalized Study Planner!");

        // Create User
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter hours available per day: ");
        int hours = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter your proficiency level (Beginner/Intermediate/Advanced): ");
        String level = scanner.nextLine();
        System.out.print("Enter your goal (e.g., Learn Core Java, Master DSA, Build a Project): ");
        String goal = scanner.nextLine();

        User user = new User(name, hours, level, goal);
        System.out.println("\nUser Profile Created: " + user);

        // Initialize Task Scheduler and Progress Tracker
        TaskScheduler scheduler = new TaskScheduler();
        ProgressTracker tracker = new ProgressTracker();

        // Filter and Display Tasks Based on User Goal & Level
        List<Task> allTasks = MockTaskData.getMockTasks();
        for (Task task : allTasks) {
            if (task.getLevel().equalsIgnoreCase(level) || task.getCategory().equalsIgnoreCase(goal)) {
                scheduler.addTask(task);
                tracker.addTask(task);
            }
        }

        // Interact with the User
        boolean running = true;
        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. View All Tasks");
            System.out.println("2. Complete a Task");
            System.out.println("3. View Progress");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    scheduler.displayTasks();
                    break;
                case 2:
                    System.out.print("Enter the task name to complete: ");
                    String taskName = scanner.nextLine();
                    Task taskToComplete = null;
                    for (Task task : scheduler.getTasks()) {
                        if (task.getName().equalsIgnoreCase(taskName)) {
                            taskToComplete = task;
                            break;
                        }
                    }
                    if (taskToComplete != null) {
                        tracker.completeTask(taskToComplete);
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;
                case 3:
                    tracker.displayProgress();
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting the program. Good luck with your learning!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }
}
