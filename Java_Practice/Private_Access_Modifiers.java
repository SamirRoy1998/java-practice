package pkg1.Java_Practice;

class My_Employee {
    private int id;
    private String name;

    public void setId(int i) {id = i;}
    public int getId() {return id;}

    public void setName(String n) {name = n;}
    public String getName() {return name;}
}

public class Private_Access_Modifiers {
    public static void main() {
        My_Employee e1 = new My_Employee();
        e1.setId(201);
        e1.setName("Samir");
        System.out.println(e1.getId());
        System.out.println(e1.getName());
    }
}
