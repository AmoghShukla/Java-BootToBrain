package Interface;

interface I1{
    int x1 = 10;
    void m1();
}

class A implements I1{
    public void m1(){
        System.out.println("m1 method");
    }
}

