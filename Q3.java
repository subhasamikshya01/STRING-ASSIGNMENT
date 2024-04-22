import java.util.Scanner;

public class TextEditor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer text = new StringBuffer();

        // Initial menu
        System.out.println("Welcome to Simple Text Editor!");
        System.out.println("1. Append text");
        System.out.println("2. Insert text");
        System.out.println("3. Delete text");
        System.out.println("4. Reverse text");
        System.out.println("5. Replace text");
        System.out.println("6. Exit");

        // Process user input
        boolean exit = false;
        while (!exit) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter text to append: ");
                    String appendText = scanner.nextLine();
                    text.append(appendText);
                    printState(text);
                    break;
                case 2:
                    System.out.print("Enter index to insert: ");
                    int insertIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter text to insert: ");
                    String insertText = scanner.nextLine();
                    text.insert(insertIndex, insertText);
                    printState(text);
                    break;
                case 3:
                    System.out.print("Enter start index to delete: ");
                    int startIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter end index to delete: ");
                    int endIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    text.delete(startIndex, endIndex);
                    printState(text);
                    break;
                case 4:
                    text.reverse();
                    printState(text);
                    break;
                case 5:
                    System.out.print("Enter start index to replace: ");
                    int replaceStartIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter end index to replace: ");
                    int replaceEndIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter replacement text: ");
                    String replacementText = scanner.nextLine();
                    text.replace(replaceStartIndex, replaceEndIndex, replacementText);
                    printState(text);
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    public static void printState(StringBuffer text) {
        System.out.println("Current state of the text: " + text);
        System.out.println("Length: " + text.length());
        System.out.println("Capacity: " + text.capacity());
        System.out.println();
    }
}
