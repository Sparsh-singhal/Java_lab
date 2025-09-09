package collection.arraylist;

//size of array= no of initialised or stored elements,capacity = max element it can store
//by default capacity is 10
//arraylist can dynamically increase its capacity
//if arraylist is full and you try to add new elements the collection will increase its capacity new cap= oldcap + (oldcap>>1) or approximately by a factor of 1.5 newcap=1.5Xoldcap
//to increase size jvm create a new arraylist of new size and then use system.
//trimtosize method is used to decrease capacity and bring it equal to size


import java.util.ArrayList;

public class A1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add("B");
        list.add(true);
        list.add(12.5);
        System.out.println(list);
    }
}
