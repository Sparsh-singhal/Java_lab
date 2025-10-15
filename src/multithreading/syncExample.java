package multithreading;


public class syncExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                counter.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                counter.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join(); // main method wait for t1 to finish
        t2.join();//  main method wait for t2 to finish
        //if both join are not there 0 is print as main finishes before the thread gets time to increment value
        //if ony one join is present main only wait for one function and only one function gets time to update value so around 1000 is printed (values can be missed due to lack of synchronization
        //if both join are present main wait for both function and value of around 2000 is printed
        System.out.println("Final Count: "+counter.getCount());
    }
}

class Counter{
    private int count = 0;

    //public void increment(){count ++;} // no synchronization

    public synchronized void increment(){count++;}//synchronizes threads

    public int getCount(){return count;}
}

