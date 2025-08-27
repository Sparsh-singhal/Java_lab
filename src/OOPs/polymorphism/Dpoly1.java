package OOPs.polymorphism;



//runtime polymorphism
//we cannot override constructor or static method
class A1{
    void m1(){
        System.out.println("print from m1 A1");
    }
}

class B1  extends A1{
    void m2(){
        System.out.println("print from m2");
    }

    void m1(){
        System.out.println("print from m1 B1");
    }

}


public class Dpoly1 {
    public static void main(String[] args) {
        System.out.println("A");
        B1 b1 = new B1();
        b1.m1();
        b1.m2();
        //as b1 is object of B1 class it can access both methods

        A1 a1 = new A1();
        a1.m1();
        //as a1 is object of A1 class it can only access m1 method not m2

        A1 b2 = new B1();
        b2.m1();
        //as now both A1 and B1 has m1 method java will decide on runtime and call m1 whose object is created

    }
}
