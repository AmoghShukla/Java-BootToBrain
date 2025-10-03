package Collection.Collection_Set;
import java.util.*;

class Book{
    private int price;
    private String name;
    public Book(int price, String name){
        this.price = price;
        this.name = name;
    }
    public String getTitle(){
        return name;
    }
    public int getPrice(){
        return price;
}
}

// Implementing the COmparator interface
class MyComparator implements Comparator{

    public int compare(Object obj1, Object obj2){
        Book b1 = (Book)obj1;
        Book b2 = (Book)obj2;
        if(b1.getPrice() < b2.getPrice()){
            return -1;
        } else if(b1.getPrice() > b2.getPrice()){
            return 1;
        } else {
            return 0;
        }
    }
}

public class TreesetExample {
    public static void main(String[] args) {
        Book b1, b2, b3;
        b1 = new Book(100, "Java");
        b2 = new Book(200, "Python");
        b3 = new Book(150, "The Subtle Art of Not Giving a F*ck");
        TreeSet t = new TreeSet(new MyComparator());
        t.add(b1);
        t.add(b2);
        t.add(b3);

        // Reference Variable for Iteration
        Book b;

        Iterator it = t.iterator();
        while(it.hasNext()){
            b=(Book)it.next();
            System.out.println(b.getTitle() + " : " + b.getPrice());
        }
    }

    
}
