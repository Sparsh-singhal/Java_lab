package multithreading;
//creating thread using thread class
//this method is a bit short in terms of line of code but a problem here is
// you cannot inherit more than 1 class in java and here you have already inherited thread class

//three threads are created here
//2 created by default and 1 that we created
// 1) created by java to rum main
// 2) Daemon thread also created by jvm to provide runtime functionalities like garbage collector
// 3) threads that we created

public class thread_class extends Thread {
    public void run() {
        System.out.println("task");
    }

    public static void main(String[] args) {
        thread_class t1 = new thread_class();
        t1.start();
    }
}
