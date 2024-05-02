package pkg1.Java_Practice;

public class methods {
    int sum(int a, int b){
        int c=a+b;
        return c;
    }
    public static void main(String[] args) {
        int x= 80;
        int y=20;
        methods obj=new methods();
        obj.sum(x,y);
    }
}
