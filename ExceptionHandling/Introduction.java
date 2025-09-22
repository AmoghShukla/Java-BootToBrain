// Introduction to Exception Handling in Java
// This program demonstrates a simple try-catch block to handle a NullPointerException.


package ExceptionHandling;

public class Introduction {
    public static void main(String[] args) {
        String s1 = null;
        System.out.println("Welcome to Exception Handling in Java!");
        try {
            System.out.println("Length of s1: " + s1.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
        // The .getMessage() method returns the detail message string of this throwable.
        // It can be useful for debugging purposes.
        System.out.println("End of the program.");
    }
}
