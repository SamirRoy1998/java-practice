package pkg1.Java_Practice;

class Phone {
    public void on() {System.out.println("Phone is turning on..");}
    public void time() {System.out.println("Time is 9.00 pm");}
}
class SmartPhone extends Phone {
    @Override
    public void on() {System.out.println("Smart Phone is turning on..");}
    public void music() {System.out.println("Playing music");}
}
public class DynamicMethodDispatch {
    public static void main() {
//        Phone ph = new Phone();             //  Its Allowed
        SmartPhone sph= new SmartPhone();   //  Its Allowed
        Phone ph = new SmartPhone();          //  Its Allowed
//        SmartPhone sph =new Phone();        //  Its not Allowed
        ph.on();
        ph.time();
//        ph.music(); //Not Allowed
        sph.music();  //Its Allowed
    }
}
