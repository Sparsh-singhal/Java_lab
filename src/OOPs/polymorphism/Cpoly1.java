package OOPs.polymorphism;


//two types of polymorphism
//1 achieved at compile time :- static or early binding
//Note:- Java doesn't support opperator overloading only + opperator is overloades in java
// it supports method overloading and constructor overloading
//we can also overload main method
//compile time polymorphism doesn't work if only return type differ
public class Cpoly1 {

    Cpoly1(){

    }
    Cpoly1(int a){

    }

    public static void main(String[] args) {
        System.out.println("main A");
        Cpoly1 cc = new Cpoly1();
        cc.m1();
        cc.m1(5);
    }

    public static void main() {
        System.out.println("main B");
    }

    void m1(int a){
        System.out.println("B");
    }

    void m1(){
        System.out.println("C");
    }

    void m1(int a , String b){
        System.out.println("D");
    }
    void  m1(String b,int a){
        System.out.println("E");
    }

}
