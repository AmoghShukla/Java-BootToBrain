// This is the main class to run the program

package Inheritance.Single;

public class Main{
    public static void main(String []args){
        Student S1 = new Student();
        S1.SetName("Amogh R Shukla");
        S1.SetAge(21);
        S1.SetRoll("2022-B-18022004");
        S1.SetStd(7);
        System.out.println("Name: " + S1.getName());
        System.out.println("Age: " + S1.getAge());
        System.out.println("Roll No: " + S1.getRoll());
        System.out.println("Standard: " + S1.getStd());

    }
}
