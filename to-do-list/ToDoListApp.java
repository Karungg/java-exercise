import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ToDoListApp {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n== TO DO LIST ==");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }

            System.out.println("\nOptions:");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Done");
            System.out.println("3. Exit:");

            int choice = getValidIntInput(scanner, "Choose : ");

            if (choice == 1) {
                System.out.println("Enter task description: ");
                String description = scanner.nextLine();
                tasks.add(new Task(description));
            } else if (choice == 2) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks available.");
                    continue;
                }
                int taskNumber = getValidIntInput(scanner, "Enter task number to mark as done: ");
                int index = taskNumber - 1;
                if (index >= 0 && index < tasks.size()) {
                    tasks.get(index).markAsDone();
                } else {
                    System.out.println("Invalid task number");
                }
            } else if (choice == 3) {
                System.out.println("Goodbye");
                break;
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }

        scanner.close();
    }

    public static int getValidIntInput(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                int input = scanner.nextInt();
                scanner.nextLine();
                return input;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter a valid number.");
                scanner.nextLine();
            }
        }
    }
}
