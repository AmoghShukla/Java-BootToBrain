package Collection.Cursor;
import java.util.*;

public class ListIterator1 {
    public static void main(String[] args){
        LinkedList al = new LinkedList();
        al.add("Amogh");
        al.add("Shukla");
        al.add("Anjali");
        al.add("Rajeshwari");

        ListIterator li = al.listIterator();

        while(li.hasNext()){
            String s = (String)li.next();
            if (s.equals("Anjali")){
                li.set("Anjali Shukla");
            }
            else if (s.equals("Rajeshwari")){
                li.add("Rajesh");
            }
            else if (s.equals("Amogh")){
                li.remove();
            }
        }
        System.out.println(al);
    }
    
}
