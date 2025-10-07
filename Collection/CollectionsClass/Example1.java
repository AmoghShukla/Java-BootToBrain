package Collection.CollectionsClass;
import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add(10);
        v1.add(20);
        v1.add(15);
        v1.add(11);
        System.out.println(v1);
        Collections.sort(v1);
        int x = Collections.binarySearch(v1, 15);
        System.out.println(v1);
        System.out.println(x);
        Collections.reverse(v1);
        System.out.println(v1);
        Collections.shuffle(v1);
        System.out.println(v1);
        Collections.swap(v1, 0, 2);
        System.out.println(v1);
    }
}
