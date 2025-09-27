package Collection.Collection_Set;
import java.util.*;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("Amogh1");
        lhs.add("Amogh2");
        lhs.add("Amogh3");
        lhs.add("Amogh4");
        lhs.add("Amogh5");
        lhs.add("Amogh6");
        System.out.println(lhs);

        // Parameterised Constructor
        LinkedHashSet lhs2 = new LinkedHashSet(5);
        lhs2.add("Shukla1");
        lhs2.add("Shukla2");
        lhs2.add("Shukla3");
        lhs2.add("Shukla4");
        lhs2.add("Shukla5");
        System.out.println(lhs2);
    }
    
}
