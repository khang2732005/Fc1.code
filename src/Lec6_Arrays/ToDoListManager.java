package Lec6_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListManager {

    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- To-Do List Menu ---");
            System.out.println("1. Add a new task");
            System.out.println("2. View all tasks");
            System.out.println("3. Remove a task by index");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the task: ");
                    String task = scanner.nextLine();
                    toDoList.add(task);
                    System.out.println("Task added.");
                    break;

                case 2:
                    System.out.println("\nYour To-Do List:");
                    for (int i = 0; i < toDoList.size(); i++) {
                        System.out.println(i + ": " + toDoList.get(i));
                    }
                    break;

                case 3:
                    System.out.print("Enter the index of the task to remove: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < toDoList.size()) {
                        toDoList.remove(index);
                        System.out.println("Task removed.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting To-Do List Manager. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
