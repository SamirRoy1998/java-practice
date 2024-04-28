package pkg1;

class Class1 {  //Its Class 1 with DEFAULT Constructor
    int id;     //Its DataType with Variable
    String name;
    String city;
    String steam;
}

class Class2 {  //Class2 is a Class with two PARAMETERIZED Constructor.
    //This Class doesn't have DEFAULT Constructor coz i made PARAMETERIZED Constructor

    int id;
    String name;
    String city;
    String steam;

    public Class2(int id, String n) {   //Class2 is a Class2's 1st PARAMETERIZED Constructor coz I put two Parameter
        this.id = id;
        this.name = n;
        this.city = "No City";
    }

    public Class2(String n, int i, String c) {  //Class2 is a Class2's 2nd PARAMETERIZED Constructor coz I put three Parameter
        this.id = i;
        this.name = n;
        this.city = c;
        this.steam = "No Stream";
    }
}

public class ConstructorOverloading {   //ConstructorOverloading is a Main Class
    public static void main() {
        Class1 st1 = new Class1();  //st1 is a Class1's DEFAULT Constructor's 1st object
        st1.name = "Raja";
        System.out.println(st1.id);
        System.out.println(st1.name);
        System.out.println(st1.city);
        System.out.println(st1.steam);
        System.out.println();

        Class1 st2 = new Class1();  //st2 is a Class1's DEFAULT Constructor's 2nd object
        st2.name = "Samir";
        st2.city = "Bongaigaon";
        System.out.println(st2.id);
        System.out.println(st2.name);
        System.out.println(st2.city);
        System.out.println(st2.steam);
        System.out.println();

        Class2 st3 = new Class2(10, "Aamir"); //st3 is a Class2's 1st PARAMETERIZED Constructor's 1st object
        System.out.println(st3.id);
        System.out.println(st3.name);
        System.out.println(st3.city);
        System.out.println(st3.steam);
        System.out.println();

        Class2 st4 = new Class2("Amir", 10, "Bongaigaon");  //st4 is a Class2's 2nd PARAMETERIZED Constructor's 1st object
        st4.steam = "Arts";
        System.out.println(st4.id);
        System.out.println(st4.name);
        System.out.println(st4.city);
        System.out.println(st4.steam);
        System.out.println();
    }
}
