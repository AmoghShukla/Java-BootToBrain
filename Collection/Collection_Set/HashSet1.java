package Collection.Collection_Set;
import java.util.*;

public class HashSet1 {
    public static void main(String[] args){
        HashSet H1 = new HashSet();
        H1.add("Amogh1");
        H1.add("Amogh2");
        H1.add("Amogh3");
        H1.add("Amogh4");
        H1.add("Amogh5");
        H1.add("Amogh6");
        System.out.println(H1);

        // Parameterised Constructor
        HashSet H2 = new HashSet(5);
        H2.add("Shukla1");
        H2.add("Shukla2");
        H2.add("Shukla3");
        H2.add("Shukla4");
        H2.add("Shukla5");
        System.out.println(H2);
        
    }    
}
