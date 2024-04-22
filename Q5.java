import java.util.Scanner;

public class StringBuilderStringBufferComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the base string and the number of concatenations
        System.out.print("Enter the base string: ");
        String baseString = scanner.nextLine();
        System.out.print("Enter the number of times to concatenate the string: ");
        int repetitions = scanner.nextInt();

        // Concatenation using StringBuilder
        long startTimeStringBuilder = System.nanoTime();
        StringBuilder stringBuilderResult = new StringBuilder();
        for (int i = 0; i < repetitions; i++) {
            stringBuilderResult.append(baseString);
        }
        long endTimeStringBuilder = System.nanoTime();
        long durationStringBuilder = endTimeStringBuilder - startTimeStringBuilder;

        // Concatenation using StringBuffer
        long startTimeStringBuffer = System.nanoTime();
        StringBuffer stringBufferResult = new StringBuffer();
        for (int i = 0; i < repetitions; i++) {
            stringBufferResult.append(baseString);
        }
        long endTimeStringBuffer = System.nanoTime();
        long durationStringBuffer = endTimeStringBuffer - startTimeStringBuffer;

        // Output the time taken for each operation and the final length of the resulting strings
        System.out.println("\nPerformance comparison:");
        System.out.println("Using StringBuilder:");
        System.out.println("Time taken: " + durationStringBuilder + " nanoseconds");
        System.out.println("Final length of the resulting string: " + stringBuilderResult.length());

        System.out.println("\nUsing StringBuffer:");
        System.out.println("Time taken: " + durationStringBuffer + " nanoseconds");
        System.out.println("Final length of the resulting string: " + stringBufferResult.length());

        scanner.close();
    }
}
