package pkg1;
    // My Custom Class
class StudentDetails{
    int id;
    String name;
    // Added methods name getDetails
    public void getDetails(){
        System.out.print("My id is: "+id);
        System.out.println(" and my name is: "+name);
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
        id1002.name = "Abhi Roy";
        id1002.id = 1002;
        id1003.name = "Ram Das";
        id1003.id = 1003;
        id1004.name = "Suraj Agarwal";
        id1004.id = 1004;
    // now calling custom class's method from the main class
        id1001.getDetails();
        id1002.getDetails();
        id1004.getDetails();
    }
}
