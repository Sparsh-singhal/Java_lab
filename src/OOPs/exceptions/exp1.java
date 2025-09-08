package OOPs.exceptions;
//there are 3 types of compile time errors
//1 Lexical errors :- A lexical error means the compiler found characters or sequences that it doesn't recognize as valid tokens. ie a spelling mistake
//2 Semantic error:- These are logic mistakes — the program runs, but the output or behavior is wrong. In other words, the code means something different than what you wanted.
//3 Syntax:- Syntax errors occur when your code violates the grammar rules of the Java language. This means your code doesn’t conform to the correct format or structure expected by the Java compiler.

//try:-risky code, catch:- handle exception if occurs, finally:- code which always runs irrespective of exception like closing a file.
//only try block,only catch block , only finally block are not allowed, try and finally together allowed, try catch finally allowed.
//you can nest try catch or try catch finally block in all three try, catch and finally blocks.
//if you are using multiple catch block with a generic catch block catch (exception e){} then this generic block must be in last.cannot use two generic blocks.
//

//error vs exception :-
//Cause	JVM-level problems	Program-level issues
//Handling	Usually not handled by application	Can be caught and handled
//Examples	OutOfMemoryError, StackOverflowError	IOException, NullPointerException
//Recoverability	Generally not recoverable	Usually recoverable
//Checked or Unchecked	No	Checked and unchecked exceptions

//in checked examples compiler gives warning while compiling that an exception can occur this doesn't occur for unchecked

//Hierarchy of exception class:-
//object -> throwable -> 1(Exception->{(checked)class not found,}) , 2(error)

//JVM creates the object which contain exception,its description and stack trace ,JVM ask the method which created exception can you handel this exception
//if try block is there it finds handler if present then ok otherwise create default handler
//when try catch block is not there it create a default exception handler and show exception,description and stack trace


public class exp1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Hi");
        try{
            System.out.println(200/0);
        }
        catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("why");
        System.out.println("now");
        System.out.println("hell");

        try{
            System.out.println(200/0);//checked error
        }
        catch(ArithmeticException e) {
            //e.getMessage
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }



        System.out.println(200/0);

    }
}
