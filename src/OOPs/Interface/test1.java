package OOPs.Interface;
//if there is no field in interface ie its has no variable and method it is called marker
//it is used to tag or mark a class
//for example there is a interface named serializable in java
//jvm sees if any class is serializable then only it will save it
interface Inter1{

}


//if any interface has only one method its called functional interface
//before version 8 by default all methods of interface are abstract( public, static,final)
// since java 8 default and static method. Since java 9 private methods too
// ie 100 percent abstraction is achieved here as no normal methods can be there in interface
interface Inter2{
    int x=112;
    void method1();
}
//it allow multiple inheritance using interface
interface Inter3{
    int x=115;
    void method2();
}

public class test1 implements Inter2,Inter3 {
    public static void main(String[] args) {
        System.out.println("Main entry point");
        System.out.println(Inter2.x);
        int x=113;
        System.out.println(x);

    }

    @Override
    public void method1() {
        System.out.println("This is method1");
    }
    @Override
    public void method2() {
        System.out.println("This is method2");
    }
}
