class StaticMember {
    int x; // Instance Variable
    static int y; // Static Variable

    public void Fun1(){} // Instance member function
    public static void Fun2(){ y = 11;} // Static member function
    
    static class test{ // Static Inner Class
        public static String Country = "India"; // Static Variable
    }
}

public class StaticMemberExample{
    public static void main(String[] args){
        StaticMember objname = new StaticMember();
        objname.x = 5; // Accessing instance variable

        StaticMember.y = 10; // Accessing static variable
        System.out.println("Value of StaticMember.y: " + StaticMember.y);
        System.out.println("Value of StaticMember.test.Country: " + StaticMember.test.Country);
        StaticMember.test.Country = "USA"; // Accessing static variable of static inner class
        System.out.println("Value of StaticMember.test.Country: " + StaticMember.test.Country);
    }

}
    