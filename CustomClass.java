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
// 2nd Custom Class
class AreaAndPerimeterCal{
    long Length;
    long Width;
    long Area;
    long Perimeter;
    public long getArea(){
        Area = Length * Width;
        return Area;
    }
    public long getPerimeter(){
        Perimeter = (Length+Width)*2;
        return Perimeter;
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
    // Creating 2nd class's objects
        AreaAndPerimeterCal sample1 = new AreaAndPerimeterCal();
        AreaAndPerimeterCal sample2 = new AreaAndPerimeterCal();
        AreaAndPerimeterCal sample3 = new AreaAndPerimeterCal();
        AreaAndPerimeterCal sample4 = new AreaAndPerimeterCal();
         sample1.Width = 25;
         sample1.Length = 25;
         sample2.Width = 50;
         sample2.Length = 25;
         sample3.Width = 25;
         sample3.Length = 50;
         sample4.Width = 36;
         sample4.Length = 25;
        System.out.println("Sample no 1 area is: "+sample1.getArea());
        System.out.printf("Sample no 1 Parimeter is: %d%n", sample1.getPerimeter());
        System.out.println(sample2.getArea());
        System.out.println(sample2.getPerimeter());
        System.out.println(sample3.getArea());
        System.out.println(sample3.getPerimeter());
        System.out.println(sample4.getArea());
        System.out.println(sample4.getPerimeter());
    }
}
