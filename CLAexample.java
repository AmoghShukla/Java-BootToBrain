public class CLAexample {
    public static void main(String[] args) {
        int s = 0;
        // Check if any command-line arguments are provided
        for( String item : args){
            s += Integer.parseInt(item); // Convert each command-line argument to an integer and add it to the sum
        }
        // Print the sum of the command-line arguments
        System.out.println("Sum of command-line arguments: " + s);
    }
    
}
