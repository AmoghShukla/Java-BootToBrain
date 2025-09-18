package Generics;

public class GenericMethod {

    public void printArray(String[] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    public void printArray(int[] num){
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }
    }

    public static void main(String[] args){
        GenericMethod gm = new GenericMethod();
        String[] strArray = new String[]{"India", "USA", "UK" , "Canada"};
        int[] intArray = new int[]{1, 2, 3, 4, 5};
        gm.printArray(strArray);
        gm.printArray(intArray);
    }
    
}
