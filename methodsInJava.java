package pkg1;

public class methodsInJava {
//--------------------------------------------------------------------
//          STATIC METHODS
//--------------------------------------------------------------------
    static int logic1 (int x, int y){
        int z;
        if (x>y){
            z= x+y;
        }
        else {
            z= x*y;
        }
        return z;
    }
//--------------------------------------------------------------------
    public static void main(String[] args) {
        int a1= 5;
        int b1= 7;
        int c1;
        c1= logic1(a1,b1);      //-> Calling using STATIC METHODS

        int a2= 9;
        int b2= 7;
        int c2;
        c2= logic1(a2,b2);      //-> Calling using STATIC METHODS

        System.out.println(c1);
        System.out.println(c2);
    }
}
