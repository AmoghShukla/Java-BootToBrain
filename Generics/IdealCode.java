package Generics;

public class IdealCode {

    public void printArray(String[] array){ // Type 1 of method overloading
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    public void printArray(int[] num){ // Type 2 of method overloading
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }
    }


    // Rather than writing multiple overloaded methods, we can use Generics to write a single method that works with different types.
    // This is done using a type parameter, typically represented by a single uppercase letter like T

    public static void main(String[] args){
        IdealCode gm = new IdealCode();
        String[] strArray = new String[]{"India", "USA", "UK" , "Canada"};
        int[] intArray = new int[]{1, 2, 3, 4, 5};
        gm.printArray(strArray);
        gm.printArray(intArray);
    }
    
}
