public class WrapperExample {

    public static void main(String[] args) {
        Integer i1 = Integer.valueOf("10");
        Double d1 = Double.valueOf("5.551");
        int a = Integer.parseInt("110");
        double b = Double.parseDouble("52.25");

        int c = i1.intValue();
        double d = d1.doubleValue();
        System.out.println("Integer value: " + c);
        System.out.println("Double value: " + d);

        System.out.println("Parsed Integer value: " + a);
        System.out.println("Parsed Double value: " + b);
    }
    
}
