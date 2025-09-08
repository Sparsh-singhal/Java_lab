package OOPs.exceptions;

import java.util.Scanner;

//throw vs throws

class MyException extends Exception {
    MyException() {
        super("Not allowed");
    }
    MyException(String msg) {
        super(msg);
    }
}
public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<18){
//            throw new MyException();
//            throw new MyException("Hey this is not allowed");
        }
        else {
            System.out.println(a);
        }
    }
}
