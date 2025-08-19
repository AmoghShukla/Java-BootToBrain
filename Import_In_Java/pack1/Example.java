package Import_In_Java.pack1;
import Import_In_Java.pack2.Student; // import the Student class from package pack 2 to use in this example

public class Example {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        student.setAge(20);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }
}
