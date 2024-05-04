package pkg1.Java_Practice;

class Parent {
    public Parent() {System.out.println("I'm Parent");}
    public Parent(int i) {System.out.println("I'm Parent with value  of i is: "+i);}
}

class Child extends Parent {
    public Child() {
        super(0);
        System.out.println("I'm Child");}
}

class GrandChild extends Child {
    public GrandChild() {System.out.println("I'm Grand Child");}
}

public class Constructor_In_Inheritance {
    public static void main(String[] args) {
//        GrandChild gc = new GrandChild();
        new Child();
    }
}
