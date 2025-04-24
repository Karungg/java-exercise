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

            int choice = -1;
            boolean validChoice = false;

            while (!validChoice) {
                System.out.print("Choose: ");
                try {
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    validChoice = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input, please enter a valid number.");
                    scanner.nextLine();
                }
            }

            if (choice == 1) {
                System.out.println("Enter task description: ");
                String description = scanner.nextLine();
                tasks.add(new Task(description));
            } else if (choice == 2) {
                int index = -1;
                boolean validTaskIndex = false;

                while (!validTaskIndex) {
                    System.out.println("Enter task number to mark as done: ");
                    try {
                        index = scanner.nextInt() - 1;
                        scanner.nextLine();
                        if (index >= 0 && index < tasks.size()) {
                            tasks.get(index).markAsDone();
                            validTaskIndex = true;
                        } else {
                            System.out.println("Invalid task number, try again.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input, please enter a valid number.");
                        scanner.nextLine();
                    }
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
}
