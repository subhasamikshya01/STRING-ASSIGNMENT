import java.util.Scanner;

public class CaseConversionAndComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Convert both strings to lowercase and uppercase
        String str1Lower = str1.toLowerCase();
        String str1Upper = str1.toUpperCase();
        String str2Lower = str2.toLowerCase();
        String str2Upper = str2.toUpperCase();

        // Compare the converted strings for case-insensitive equality
        boolean isEqualIgnoreCase = str1Lower.equals(str2Lower);

        // Display the converted strings and the result of the comparison
        System.out.println("\nConverted strings and comparison result:");
        System.out.println("Original String 1: " + str1);
        System.out.println("Lowercase String 1: " + str1Lower);
        System.out.println("Uppercase String 1: " + str1Upper);
        System.out.println("Original String 2: " + str2);
        System.out.println("Lowercase String 2: " + str2Lower);
        System.out.println("Uppercase String 2: " + str2Upper);
        System.out.println("Case-insensitive Equality: " + isEqualIgnoreCase);

        scanner.close();
    }
}
