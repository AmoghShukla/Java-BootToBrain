package Collection.CollectionsClass;
import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add("10");
        v1.add("20");
        v1.add("15");
        v1.add("5");
        System.out.println(v1);
        Collections.sort(v1);
        Collections.sort(v1);
        Collections.sort(v1);
        System.out.println(v1);
    }
}
