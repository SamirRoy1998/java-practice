package pkg1.Java_Practice;

public class Methods_Overloading {
    void greet() {
        System.out.println("Hi! Nice to meet you.");
    }

    void greet(String a) {
        System.out.println("Hi " + a + "! Nice to meet you.");
    }

    void greet(String a, String b) {
        System.out.println("Hi " + a + " and " + b + "! Nice to meet you both.");
    }

    int greet(int a) {
        System.out.println("Love you " + a);
        return a;
    }

    public static void main(String[] args) {
        String a = "Samir";
        String b = "Susmita";
        int num = 3000;

        Methods_Overloading obj = new Methods_Overloading();
        obj.greet();
        obj.greet(a);
        obj.greet(a, b);
        obj.greet(num);
    }
}
