package Array;
import java.util.*;

public class Array {
    public static void main(String [] args){
        int [] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        for(int i = 0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<5; i++){
            System.out.println("Element at index "+i+" : "+arr[i]);
            System.out.println("arr["+i+"] : "+arr[i]);
            
        }
        sc.close();
    }
    
}
