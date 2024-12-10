package main;

public class User {
    private String name;
    private int availableHoursPerDay;
    private String proficiencyLevel; // Beginner, Intermediate, Advanced
    private String goal;

    // Constructor
    public User(String name, int availableHoursPerDay, String proficiencyLevel, String goal) {
        this.name = name;
        this.availableHoursPerDay = availableHoursPerDay;
        this.proficiencyLevel = proficiencyLevel;
        this.goal = goal;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvailableHoursPerDay() {
        return availableHoursPerDay;
    }

    public void setAvailableHoursPerDay(int availableHoursPerDay) {
        this.availableHoursPerDay = availableHoursPerDay;
    }

    public String getProficiencyLevel() {
        return proficiencyLevel;
    }

    public void setProficiencyLevel(String proficiencyLevel) {
        this.proficiencyLevel = proficiencyLevel;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", availableHoursPerDay=" + availableHoursPerDay +
                ", proficiencyLevel='" + proficiencyLevel + '\'' +
                ", goal='" + goal + '\'' +
                '}';
    }
}
