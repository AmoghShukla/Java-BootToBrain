package Collection.Collection_Set;
import java.util.*;

public class NavigableSet1 {
    public static void main(String[] args) {
        NavigableSet navigableSet = new TreeSet();
        navigableSet.add("Banana");
        navigableSet.add("Apple");
        navigableSet.add("Mango");
        navigableSet.add("Orange");


        System.out.println("Navigable Set: " + navigableSet);
        System.out.println("First Element: " + navigableSet.first());
        System.out.println("Last Element: " + navigableSet.last());
        System.out.println("Lower than Mango: " + navigableSet.lower("Mango"));
        System.out.println("Higher than Mango: " + navigableSet.higher("Mango"));
        System.out.println("Floor of Mango: " + navigableSet.floor("Mango"));
        System.out.println("Ceiling of Mango: " + navigableSet.ceiling("Mango"));
        System.out.println("Descending Set: " + navigableSet.descendingSet());
        System.out.println("Poll First: " + navigableSet.pollFirst());
        System.out.println("Poll Last: " + navigableSet.pollLast());
    }
    
}
