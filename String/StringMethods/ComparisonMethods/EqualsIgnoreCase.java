package String.StringMethods.ComparisonMethods;

public class EqualsIgnoreCase {
    public static void main(String[] args){
        String s1 = new String("hello");
        String s2 = new String("Hello");
        if (s1.equalsIgnoreCase(s2)){
            System.out.println("Strings are equal (ignoring case)");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
