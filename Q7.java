import java.util.Scanner;

public class CharacterArraySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert the string to a character array
        char[] charArray = inputString.toCharArray();

        // Prompt the user to enter a character to search
        System.out.print("Enter a character to search in the string: ");
        char searchChar = scanner.next().charAt(0);

        // Find the first occurrence of the character
        int firstOccurrence = -1;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == searchChar) {
                firstOccurrence = i;
                break;
            }
        }

        // Find the last occurrence of the character
        int lastOccurrence = -1;
        for (int i = charArray.length - 1; i >= 0; i--) {
            if (charArray[i] == searchChar) {
                lastOccurrence = i;
                break;
            }
        }

        // Display the character array
        System.out.println("\nCharacter array:");
        System.out.println(charArray);

        // Display the positions found (if any)
        if (firstOccurrence != -1 && lastOccurrence != -1) {
            System.out.println("First occurrence of '" + searchChar + "' at position: " + firstOccurrence);
            System.out.println("Last occurrence of '" + searchChar + "' at position: " + lastOccurrence);
        } else {
            System.out.println("Character '" + searchChar + "' not found in the string.");
        }

        scanner.close();
    }
}
