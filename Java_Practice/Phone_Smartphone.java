package pkg1.Java_Practice;

class MyPhone{
    void ring(){
        System.out.println("Ringing.....");
    }
    void call(){
        System.out.println("Calling...");
    }
}

class MySmartPhone extends MyPhone{
    @Override
    void call() {
        System.out.println("Calling from Smartphone.");
    }
    void music(){
        System.out.println("Playing Musics");
    }
}
public class Phone_Smartphone {
    public static void main(String[] args) {
    MyPhone p = new MySmartPhone();
    p.call();
    p.ring();
    }
}
