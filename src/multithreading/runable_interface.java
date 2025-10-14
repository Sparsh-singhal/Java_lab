package multithreading;

public class runable_interface implements Runnable {
    public void run() {
        System.out.println("task");
    }

    public static void main(String[] args) {
        runable_interface r = new runable_interface();
        Thread t1 = new Thread(r);
        t1.start();
    }
}
