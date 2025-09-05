package String.StringMethods.ComparisonMethods;

public class CompareTo {
    // compareTo() method compares two strings lexicographically.
    // The comparison is based on the Unicode value of each character in the strings.
    public static void main(String[] args){
        String s1 = "apple"; // lowercase 'a' has a higher Unicode value than uppercase 'A'
        String s2 = "Apple"; // uppercase 'A' has a lower Unicode value than lowercase 'a'
        int result = s1.compareTo(s2);
        if (result == 0){
            System.out.println(s1 + " & " + s2 + " are same");
        } else if (result > 0) {
            System.out.println(s1 + " & " + s2 + " are not same");
        } else {
            System.out.println(s1 + " & " + s2 + " are not same");
        }
    }
    
}
