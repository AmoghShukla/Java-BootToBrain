package Import_In_Java;

public class Example {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        student.setAge(20);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }
}
