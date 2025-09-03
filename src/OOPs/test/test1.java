package OOPs.test;

import java.util.Scanner;

abstract class transport{
    int booking_amount;
    String booking_id;
    String booking_time;
    void book_ride(int booking_amount){
        this.booking_amount = booking_amount;
        this.booking_id = booking_id;
        System.out.println("Ride booked "+booking_id);
    }
    abstract void cancel_ride();
    void schedule_rides(int booking_amount, String booking_time) {
        System.out.println("Ride scheduled for "+booking_time);
        book_ride(booking_amount);
    }

}

class cab extends transport{
    @Override
    void cancel_ride() {
        System.out.println("Cab cancelled");
        System.out.println("Refunded amount is "+(booking_amount-200));
    }
}
class bus extends transport{
    @Override
    void cancel_ride() {
        System.out.println("Sorry, cannot cancel a Bus");
    }

    @Override
    void schedule_rides(int booking_amount, String booking_time) {
        System.out.println("Bus scheduling not available");
    }
}
class train extends transport{
    @Override
    void cancel_ride() {
        System.out.println("Train cancelled");
        System.out.println("Refunded amount is "+(booking_amount-200));
    }
}

public class test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        transport vehicle;
        System.out.println("Enter your Choice: \n1. Cab\n2. Train\n3. Bus");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                vehicle = new cab();
                break;
            case 2:
                vehicle = new train();
                break;
            case 3:
                vehicle = new bus();
                break;
            default:
                System.out.println("Wrong choice");

        }
    }
}