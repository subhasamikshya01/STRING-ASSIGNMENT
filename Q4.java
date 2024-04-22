import java.util.Scanner;

public class StringBuilderTextManipulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder(inputString);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add a substring at a specified position");
            System.out.println("2. Remove a range of characters");
            System.out.println("3. Modify a character at a specified index");
            System.out.println("4. Concatenate another string at the end");
            System.out.println("5. Display current string");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the substring to add: ");
                    String substringToAdd = scanner.nextLine();
                    System.out.print("Enter the position to add at: ");
                    int positionToAdd = scanner.nextInt();
                    stringBuilder.insert(positionToAdd, substringToAdd);
                    break;
                case 2:
                    System.out.print("Enter the start index to remove: ");
                    int startIndexToRemove = scanner.nextInt();
                    System.out.print("Enter the end index to remove: ");
                    int endIndexToRemove = scanner.nextInt();
                    stringBuilder.delete(startIndexToRemove, endIndexToRemove);
                    break;
                case 3:
                    System.out.print("Enter the index to modify: ");
                    int indexToModify = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter the new character: ");
                    char newChar = scanner.nextLine().charAt(0);
                    stringBuilder.setCharAt(indexToModify, newChar);
                    break;
                case 4:
                    System.out.print("Enter the string to concatenate: ");
                    String stringToConcatenate = scanner.nextLine();
                    stringBuilder.append(stringToConcatenate);
                    break;
                case 5:
                    System.out.println("Current string: " + stringBuilder.toString());
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

