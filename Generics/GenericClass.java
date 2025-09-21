// The Main Difference Between Generic Class and Generic Method is that:
// A Generic Class is a class that can work with different data types, allowing you to create objects of the class with various types without needing to write multiple versions of the class.
// A Generic Method is a method that can operate on different data types, allowing you to write a single method that can handle various types without needing to overload the method for each type.

package Generics;

class MyData <T>{
    T i;
    public void Add(T i1){
        i = i1;
    }
    public T get(){
        return i;
    }
}

public class GenericClass {
    public static void main(String[] args){
        MyData<Integer> obj = new MyData<>();
        MyData<String> obj2 = new MyData<>();
        obj.Add(10);
        obj2.Add("Hello");
        System.out.println(obj.get());
        System.out.println(obj2.get());
    }
    
}
