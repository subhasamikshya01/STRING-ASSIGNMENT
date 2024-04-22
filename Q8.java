import java.util.Scanner;

public class StringConcatenationAndCharacterRetrieval {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take two strings from the user
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Concatenate the strings using the concat() method and the + operator
        String concatMethodResult = str1.concat(str2);
        String plusOperatorResult = str1 + str2;

        // Display both results
        System.out.println("\nConcatenation using the concat() method: " + concatMethodResult);
        System.out.println("Concatenation using the + operator: " + plusOperatorResult);

        // Ask the user for an index number
        System.out.print("\nEnter an index number to retrieve the character: ");
        int index = scanner.nextInt();

        // Display the character at the specified index
        if (index >= 0 && index < concatMethodResult.length()) {
            char characterAtIndex = concatMethodResult.charAt(index);
            System.out.println("Character at index " + index + ": " + characterAtIndex);
        } else {
            System.out.println("Invalid index. Index should be between 0 and " + (concatMethodResult.length() - 1));
        }

        scanner.close();
    }
}
