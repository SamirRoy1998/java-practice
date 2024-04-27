package pkg1;
    // My Custom Class
class StudentDetails{
    int id;
    String name;
    int s1;
    int s2;
    int mil;
    int eng;
    int total;
    // Added methods name getDetails
    public void getDetails(){
        System.out.print("My id is: "+id);
        System.out.println(" and my name is: "+name);
    }
        // Added methods name getTotal
    public void getTotal(){
        System.out.println(total = s1 + s2 + mil + eng);
    }
}

public class CustomClass {
    public static void main(String[] args) {
    // Added objects for custom class
        StudentDetails id1001 = new StudentDetails();
        StudentDetails id1002 = new StudentDetails();
        StudentDetails id1003 = new StudentDetails();
        StudentDetails id1004 = new StudentDetails();
    // now store value in custom class's variable
        id1001.name = "Raj Sutradhar";
        id1001.id = 1001;
        id1001.s1 = 94;
        id1001.s2 = 84;
        id1001.mil = 80;
        id1001.eng = 86;
        id1002.name = "Abhi Roy";
        id1002.id = 1002;
        id1002.s1 = 94;
        id1002.s2 = 84;
        id1002.mil = 80;
        id1002.eng = 86;
        id1003.name = "Ram Das";
        id1003.id = 1003;
        id1003.s1 = 94;
        id1003.s2 = 84;
        id1003.mil = 80;
        id1003.eng = 86;
        id1004.name = "Suraj Agarwal";
        id1004.id = 1004;
        id1004.s1 = 94;
        id1004.s2 = 84;
        id1004.mil = 80;
        id1004.eng = 86;
    // now calling custom class's first method from the main class
        id1001.getDetails();
        id1002.getDetails();
        id1004.getDetails();
    // now calling custom class's second method from the main class
        id1003.getTotal();
    }
}
