package OOPs.encapsulation;

import java.lang.reflect.Field;

//private varriable cannot be accessed directly getter and setter methods must be used
class Employee{
    private double salary;
    private String name;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class encapsu {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello");
        //code to bypass getter &setter
        //reflection reflect class must be used for this
        //this is illegal
        Employee emp = new Employee();
        Field fsalary = Employee.class.getDeclaredField("salary");
        fsalary.setAccessible(true);
        System.out.println(fsalary.get(emp));

        //using getter setter
        Employee emp2 = new Employee();
        emp2.setSalary(50000);
        System.out.println(emp2.getSalary());
    }
}
