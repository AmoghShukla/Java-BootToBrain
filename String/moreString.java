package String;

public class moreString {
    public static void main(String[] args){
        String Str1 = "computer";
        String Str2 = "computer";
        String Str3 = new String("computer");
        System.out.println(Str1 == Str2); // true, because both refer to the same object in the string pool
        System.out.println(Str1 == Str3); // false, because Str3 refers to a different object in the heap
        System.out.println(Str1.equals(Str3)); // true, because the content of both strings is the same
    }
    
}
