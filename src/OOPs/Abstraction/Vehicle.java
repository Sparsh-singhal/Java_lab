package OOPs.Abstraction;
//abstract method is a method which is only initialized not implemented
//to create abstract method class must be abstract
//it's not compulsory to have a bstract method in a abstract class
abstract public class Vehicle {
    int no_tyre;
    void common(){
        System.out.println("This is a common vehicle");
    }
    abstract void stop();
    public static void main(String[] args) {

    }
}
