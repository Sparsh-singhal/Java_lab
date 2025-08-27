package OOPs.Abstraction;
//we must impement abstract methods if we want to inherit a abstract class
public class Car extends Vehicle {
    @Override
    void stop() {
        System.out.println("Car stopped");
    }
}
