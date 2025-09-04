package String.StringMethods.ComparisonMethods;

public class CompareTo {
    public static void main(String[] args){
        String s1 = "apple";
        String s2 = "Apple";
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
