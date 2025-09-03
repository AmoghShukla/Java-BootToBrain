import java.util.Scanner; // Import the Scanner class

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in); // Create a Scanner object
        String name = sc.nextLine(); // Read user input
        System.out.println("Hello, " + name + "!"); // Output user input
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("You are " + age + " years old.");
        sc.close(); // Close the scanner
    }
}
