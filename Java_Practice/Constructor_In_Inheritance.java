package pkg1.Java_Practice;

class Parent {
    public Parent() {System.out.println("I'm Parent");}
}

class Child extends Parent {
    public Child() {System.out.println("I'm Child");}
}

class GrandChild extends Child {
    public GrandChild() {System.out.println("I'm Grand Child");}
}

public class Constructor_In_Inheritance {
    public static void main(String[] args) {
        GrandChild gc = new GrandChild();
    }
}
