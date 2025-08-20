// This Student class is a subclass of Person, it inherits the properties of Person

package Inheritance.Single;

public class Student extends Person {
    private String RollNo;
    private int Std;

    public void SetRoll(String n){
        RollNo = n;
    }

    public String getRoll(){
        return(RollNo);
    }

    public void SetStd(int m){
        Std = m;
    }

    public int getStd(){
        return(Std);
    }

}
