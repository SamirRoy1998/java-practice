package pkg1.Java_Practice;

class Employee {
    int id;
    String name;
    int salary;

    public void getDetails() {
        System.out.println("My name is: " + name + " and my Id is: " + id);
    }

    public void getSalary() {
        System.out.println("My salary is: " + salary);
    }
}

public class Custom_Class {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.id = 249;
        e1.name = "Samir";
        e1.salary = 50000;

        e1.getDetails();
        e1.getSalary();

    }
}
