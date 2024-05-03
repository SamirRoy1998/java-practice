package pkg1.Java_Practice;

public class methods {
    int sum(int a, int b){
        int c=a+b;
        return c;
    }
    int modify(int[]arr){
        arr[1]=75;
        return arr[1];
    }
    public static void main(String[] args) {
        int x= 80;
        int y=20;
        methods obj=new methods();
        obj.sum(x,y);

        int [] marks={98,52,74,85,68};
        obj.modify(marks);
        for (int element:marks){
            System.out.println(element);
        }
    }
}
