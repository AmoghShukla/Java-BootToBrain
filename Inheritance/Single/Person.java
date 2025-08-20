package Inheritance;

public class Person {
    private String Name;
    private int Age;

    public void SetName(String name){
        Name = name;
    }

    public void SetAge(int age){
        Age = age;
    }

    public String getName(){
        return(Name);
    }

    public int getAge(){
        return(Age);
    }
}
