package String.StringMethods;

public class IndexOf {
    public static void main(String[] args) {
        String str = "Hello, welcome to the world of Java programming.";
        int index1 = str.indexOf("welcome");
        System.out.println("Index of 'welcome': " + index1); // Output: 7
        int index2 = str.indexOf("Java");
        System.out.println("Index of 'Java': " + index2);    // Output: 27
        int index3 = str.indexOf("Python"); // Not found, should return -1
        System.out.println("Index of 'Python': " + index3);  // Output: -1

        String str2 = "banana";
        int firstIndex = str2.indexOf('a');
        System.out.println("First index of 'a' in 'banana': " + firstIndex); // Output: 1
        int lastIndex = str2.lastIndexOf('a');
        System.out.println("Last index of 'a' in 'banana': " + lastIndex);   // Output: 5
    }
    
}
