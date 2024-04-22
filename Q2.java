public class StringImmutabilityDemo {

    public static void main(String[] args) {
        // Demonstrate String immutability
        String str = "Hello";
        System.out.println("Original string: " + str);

        // Modifying the string
        str = str.concat(" World");
        System.out.println("Modified string: " + str);

        // Demonstrate CharSequence usage
        CharSequence charSeq = "Java";
        System.out.println("\nUsing CharSequence:");
        System.out.println("Length: " + charSeq.length());
        System.out.println("Character at index 1: " + charSeq.charAt(1));
        System.out.println("Subsequence from index 1 to 3: " + charSeq.subSequence(1, 3));

        // Attempting to modify CharSequence (which is actually a String)
        // charSeq.append(" is awesome!"); // This line would result in a compile-time error
    }
}
