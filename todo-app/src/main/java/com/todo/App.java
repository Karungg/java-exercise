package com.todo;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        TaskService service = new TaskService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n== TO DO LIST ==");
            List<Task> tasks = service.getTasks();
            for (Task task : tasks) {
                System.out.println(task.getId() + ". " + task.getDescription() + " ["
                        + (task.isDone() ? "Done" : "Pending") + "]");
            }

            System.out.println("\nOptions:");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Done");
            System.out.println("3. Exit");

            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("Enter task description: ");
                String description = scanner.nextLine();
                service.addTask(description);
            } else if (choice == 2) {
                System.out.print("Enter task ID to mark as done: ");
                int id = scanner.nextInt();
                service.markTaskAsDone(id);
            } else if (choice == 3) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }

        scanner.close();
    }
}
