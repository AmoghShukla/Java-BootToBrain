package Collection.List;
import java.util.*;

public class Vector1 {
    public static void main(String[] args){
        Vector V1 = new Vector();
        V1.addElement("Amogh");
        V1.addElement("Shukla");
        V1.size();
        System.out.println(V1.capacity());
        System.out.println(V1.elementAt(0));
        System.out.println(V1.indexOf("Shukla"));
    }
    
}
