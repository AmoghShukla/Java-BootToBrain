public class CLIexample {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Command-line arguments received:");
            for (String item : args) { // item : args is a simpler form of for(String item in args) which means that it iterates over every element of args
                System.out.println(item);
            }
        } else {
            System.out.println("No command-line arguments provided.");
        }
    }
}

