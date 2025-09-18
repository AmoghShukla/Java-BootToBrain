package Generics;

public class GenericMethod {
    // Using Generics to create a single method that can handle different types of arrays
    // The Syntax for defining a generic method includes a type parameter (like <X>) before the return type of the method.
    // Here, X is a placeholder for the actual type that will be specified when the method is called.
    public <X> void printArray(X[] array){ 
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args){
        GenericMethod gm = new GenericMethod();
        String[] strArray = new String[]{"India", "USA", "UK" , "Canada"}; // Array of Strings
        Integer[] intArray = new Integer[]{1, 2, 3, 4, 5}; // Array of Integers
        gm.printArray(strArray);
        gm.printArray(intArray);
    }
    
}
