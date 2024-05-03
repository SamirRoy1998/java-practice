package pkg1.Java_Practice;

class My_Employee {
    private int id;
    private String name;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
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
