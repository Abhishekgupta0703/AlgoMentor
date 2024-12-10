# Algo Mentor & Schedular

## **Project Overview**

This Java-based **Task Management and Scheduler** application is designed to help users organize, track, and prioritize their tasks effectively. Whether you're learning programming, tackling algorithms, or working on a personal project, this app is here to help you stay on track.

With features like task prioritization, categorization, and progress tracking, this app provides a simple yet powerful solution to manage your learning or work goals. It allows users to define tasks, assign categories and difficulty levels, and track their progress.

---

## **Motive of the Project**

The primary goal of this project is to create a simple task management system with a focus on prioritization and task categorization. This tool is intended for:

- **Students and Learners**: To keep track of tasks, projects, and assignments for different learning levels (Beginner, Intermediate, Advanced).
- **Professionals**: For task prioritization in everyday work or large projects.
- **Anyone looking to stay organized**: Whether you're managing daily tasks, programming assignments, or study goals.

By building this, we also aim to demonstrate how object-oriented principles can be used in real-world scenarios to create organized, modular, and scalable systems.

---

## **Features**

- **Task Categorization**: Categorize tasks by type (e.g., Core Java, Data Structures, Algorithms, Projects).
- **Task Prioritization**: Tasks are prioritized with levels (Beginner, Intermediate, Advanced).
- **Task Progress Tracking**: Mark tasks as completed and track progress with ease.
- **Priority Queue**: Tasks are scheduled based on priority using a `PriorityQueue`.
- **User-Friendly CLI**: Simple command-line interface to interact with the Algo Mentor.

---

## **Technologies Used**

- **Java**: Core programming language for building the Algo Mentor.
- **PriorityQueue**: Java's built-in priority queue to manage tasks based on priority levels.
- **HashSet**: To track completed tasks without duplication.
- **ArrayList**: For managing and displaying tasks in a dynamic way.

---

## **Installation Steps**

Follow these steps to run the Task Management application on your local machine:

### **Step 1: Clone the Repository**

Start by cloning this repository to your local machine.

```bash
git clone https://github.com/your-username/AlgoMentor.git
```

### **Step 2: Navigate to Project Directory**

Change your directory to the project folder.

```bash
cd AlgoMentor
```

### **Step 3: Compile the Java Files**

Compile all Java files in the `main`, `data`, and `utils` directories using the `javac` command.

```bash
javac main/*.java data/*.java utils/*.java
```

### **Step 4: Run the Program**

Run the `Main` class to start the Algo Mentor.

```bash
java main.Main
```

You can now interact with the program through the console, adding, marking as complete, and viewing your tasks.

---

## **How the Program Works**

1. **Task Definition**: Tasks are defined with a name, category, difficulty level (Beginner, Intermediate, Advanced), and priority.
   
   Example: `Task("Learn Loops in Java", "Core Java", "Beginner", 1)`

2. **Task Scheduler**: The `TaskScheduler` class is responsible for holding the tasks and displaying them based on their priority.
   
3. **Task Progress Tracker**: The `ProgressTracker` class helps in marking tasks as complete and tracking the progress over time.
   
4. **Priority Queue**: Tasks are stored in a `PriorityQueue`, and tasks with higher priority are shown first.
   
5. **CLI Interface**: A simple text-based interface allows users to select tasks based on categories and difficulty levels, track progress, and mark tasks as completed.

---

## **Project Structure**

Here’s the project directory structure for better understanding:

```
task-scheduler/
│
├── data/               # Contains sample data for tasks
│   └── MockTaskData.java
│
├── main/               # Main classes for running the program
│   ├── Main.java
│   ├── Task.java       # Represents a task with details (name, category, level, priority)
│   └── TaskScheduler.java  # Manages the task queue
│
└── utils/              # Utility classes
    └── ProgressTracker.java  # Tracks the progress of tasks
```

---

## **Example Run**

Here’s an example of how the program works:

1. **View All Tasks**: Display all tasks in a categorized manner.
2. **Add a New Task**: Add new tasks with a difficulty level and priority.
3. **Complete a Task**: Mark a task as completed to keep track of your progress.
4. **Display Completed Tasks**: See all completed tasks and monitor your progress over time.

---

## **Contributing**

Feel free to fork this repository and contribute to the project. Here are some ways you can contribute:

- **Bug Fixes**: Report any bugs you find or submit fixes through a pull request.
- **New Features**: Propose new features such as task reminders, integration with a database, etc.
- **Improvements**: Help with code quality improvements, optimization, and documentation.

---

## **License**

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## **Contact**

For any questions or feedback, feel free to open an issue in the repository or contact the project maintainer:

- **Email**: Abhishekgupta26267@gmail.com
- **LinkedIn**: [Your LinkedIn Profile](https://linkedin.com/in/Abhishekgupta0703)

---

### **Thank you for using the Task Scheduler!**

---
