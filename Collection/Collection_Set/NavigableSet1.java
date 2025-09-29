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
        

       
    }
    
}
