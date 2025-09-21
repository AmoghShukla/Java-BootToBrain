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
