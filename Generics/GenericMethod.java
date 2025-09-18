package Generics;

public class GenericMethod {

    public <X> void printArray(X[] array){ 
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args){
        GenericMethod gm = new GenericMethod();
        String[] strArray = new String[]{"India", "USA", "UK" , "Canada"};
        Integer[] intArray = new Integer[]{1, 2, 3, 4, 5};
        gm.printArray(strArray);
        gm.printArray(intArray);
    }
    
}
