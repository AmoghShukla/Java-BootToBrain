public class CLAexample {
    public static void main(String[] args) {
        int s = 0;
        for( String item : args){
            s += Integer.parseInt(item); // Convert each command-line argument to an integer and add it to the sum
        }
        System.out.println("Sum of command-line arguments: " + s);
    }
    
}
