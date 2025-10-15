package multithreading;
//Lambda expression (Anonymous function):- ->(int a ,int b)-> {return a+b};
//if it has only one statement curly brce and return can be omitted  ->(int a,int b)-> a+b;

//if you try to create a object of a implement it behind the scenes create a anonymous class
//name of class will be interfacename$1.Class

@FunctionalInterface
interface Animal {
    void say();
}

//public class anonymous {
//    Animal a = new Animal();
//    public static void main(String[] args) {
//        public void say()
//    }
//
//}
