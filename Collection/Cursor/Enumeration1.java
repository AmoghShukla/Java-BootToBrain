package Collection.Cursor;
import java.util.*;

public class Enumeration1 {
    public static void main(String[] args){
        Vector v = new Vector();
        v.addElement("One");
        v.addElement("Two");
        v.addElement("Three");

        Enumeration e = v.elements(); 
        while(e.hasMoreElements()){
            String s = (String)e.nextElement();
            System.out.println(s);
            System.out.println("Length : "+ s.length());
        }
    }
    
}
