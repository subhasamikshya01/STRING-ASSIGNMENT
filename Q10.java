import java.util.Scanner;

public class InteractiveStringExplorer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        boolean exit = false;
        while (!exit) {
            // Display menu options
            System.out.println("\nMenu:");
            System.out.println("1. Convert to lowercase");
            System.out.println("2. Convert to uppercase");
            System.out.println("3. Search for a character");
            System.out.println("4. Search for an index");
            System.out.println("5. Concatenate with another string");
            System.out.println("6. Exit");

            // Prompt the user to choose an option
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.println("Result: " + inputString.toLowerCase());
                    break;
                case 2:
                    System.out.println("Result: " + inputString.toUpperCase());
                    break;
                case 3:
                    System.out.print("Enter a character to search for: ");
                    char searchChar = scanner.next().charAt(0);
                    if (inputString.contains(String.valueOf(searchChar))) {
                        System.out.println("Character '" + searchChar + "' found in the string.");
                    } else {
                        System.out.println("Character '" + searchChar + "' not found in the string.");
                    }
                    break;
                case 4:
                    System.out.print("Enter an index to search for: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < inputString.length()) {
                        System.out.println("Character at index " + index + ": " + inputString.charAt(index));
                    } else {
                        System.out.println("Invalid index. Index should be between 0 and " + (inputString.length() - 1));
                    }
                    break;
                case 5:
                    System.out.print("Enter another string to concatenate: ");
                    String anotherString = scanner.nextLine();
                    System.out.println("Result: " + inputString.concat(anotherString));
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
}
