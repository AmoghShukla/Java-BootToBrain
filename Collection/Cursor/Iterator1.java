package Collection.Cursor;
import java.util.*;

public class Iterator1 {
    public static void main(String[] args){
        ArrayList al = new ArrayList();
        for(int i=0; i<=10; i++){
            al.add(i);
        }
        Iterator it = al.iterator();
        while(it.hasNext()){
            Integer I = (Integer)it.next();
            if(I > 3 && I < 8){
                it.remove();
            }
            System.out.println(I);
        } 
        System.out.println(al);
    }
    
}
