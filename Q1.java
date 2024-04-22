public class StringCreationDemo {

    public static void main(String[] args) {
        // Using string literals
        String str1 = "hello";
        String str2 = "hello";

        // Using the new keyword
        String str3 = new String("hello");
        String str4 = new String("hello");

        // Checking memory usage
        System.out.println("Using string literals:");
        System.out.println("str1 memory address: " + System.identityHashCode(str1));
        System.out.println("str2 memory address: " + System.identityHashCode(str2));

        System.out.println("\nUsing the new keyword:");
        System.out.println("str3 memory address: " + System.identityHashCode(str3));
        System.out.println("str4 memory address: " + System.identityHashCode(str4));

        // String comparison
        System.out.println("\nString comparison:");
        System.out.println("str1 == str2: " + (str1 == str2)); // True, same memory address
        System.out.println("str1 == str3: " + (str1 == str3)); // False, different memory addresses
        System.out.println("str3 == str4: " + (str3 == str4)); // False, different memory addresses

        System.out.println("\nString content comparison:");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // True, same content
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // True, same content
        System.out.println("str3.equals(str4): " + str3.equals(str4)); // True, same content
    }
}
