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

public class TreesetExample {
    public static void main(String[] args) {
        Book b1, b2, b3;
        b1 = new Book(100, "Java");
        b2 = new Book(200, "Python");
        b3 = new Book(150, "The Subtle Art of Not Giving a F*ck");
    }
    
}
