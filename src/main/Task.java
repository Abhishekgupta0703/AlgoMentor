package main;

public class Task {
    private String name;
    private String category;
    private String level;
    private int priority;  // New field to define the priority

    // Constructor
    public Task(String name, String category, String level, int priority) {
        this.name = name;
        this.category = category;
        this.level = level;
        this.priority = priority;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getLevel() {
        return level;
    }

    public int getPriority() {  // New method to return the priority
        return priority;
    }

    @Override
    public String toString() {
        return "Task{name='" + name + "', category='" + category + "', level='" + level + "', priority=" + priority + "}";
    }
}
