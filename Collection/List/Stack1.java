package Collection.List;
import java.util.*;

public class Stack1 {
    public static void main(String[] args){
        Stack S1 = new Stack();
        S1.push("Amogh");
        S1.push("Shukla");
        S1.push("Rajesh");
        System.out.println(S1.pop());
        System.out.println(S1.peek());
        System.out.println(S1.search("Amogh"));
    }
    
}
