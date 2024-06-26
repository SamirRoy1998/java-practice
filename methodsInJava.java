package pkg1;

public class methodsInJava {
//--------------------------------------------------------------------
//          STATIC METHODS (Note: Using static method you don't have to create object )
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
//          NON-STATIC METHODS (Note: Using non-static methods you have to create an object to call logic)
//--------------------------------------------------------------------
    int logic2 (int x, int y){
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
//          METHODS OVERLOADING
//--------------------------------------------------------------------
    static void mo(){
        System.out.println("Hi! Nice to meet you.");
    }
    static void mo(String a){
        System.out.println("Hi "+a+"! Nice to meet you.");
    }
    static void mo(String a,String b){
        System.out.println("Hi "+a+" and "+b+"! Nice to meet you both.");
    }
//--------------------------------------------------------------------
//          VARARGS (Variable Arguments)
//--------------------------------------------------------------------
    static int sum(int ...arr){
        int result=0;
        for (int a:arr){
            result += a;
        }
        return result;
    }
//--------------------------------------------------------------------
    public static void main(String[] args) {
        methodsInJava obj=new methodsInJava();  //-> Creating an object for using NON_STATIC METHODS
        int a1= 5;
        int b1= 7;
        int c1l1;
        int c1l2;
        c1l1= logic1(a1,b1);          //-> Calling STATIC METHODS
        c1l2= obj.logic2(a1,b1);      //-> Calling NON-STATIC METHODS

        int a2= 9;
        int b2= 7;
        int c2l1;
        int c2l2;
        c2l1= logic1(a2,b2);          //-> Calling STATIC METHODS
        c2l2= obj.logic2(a2,b2);      //-> Calling NON-STATIC METHODS

        System.out.println(c1l1+" = This is 1st data's result using STATIC METHODS");
        System.out.println(c1l2+" = This is 1st data's result using NON-STATIC METHODS");
        System.out.println(c2l1+" = This is 2nd data's result using STATIC METHODS");
        System.out.println(c2l2+" = This is 2nd data's result using NON-STATIC METHODS\n\n");

        mo();
        mo("Samir");
        mo("Samir","Susmita");
        System.out.println("\n");

        System.out.println("Welcome to VarAges.");
        System.out.println("The sum of nothing is: " + sum());
        System.out.println("The sum of 8 is: " + sum(8));
        System.out.println("The sum of 2 and 3 is: " + sum(2,3));
        System.out.println("The sum of 6,5 and 8 is: " + sum(6,5,8));
        System.out.println("The sum of 14,18,30,10,15 and 19 is: " + sum(14,18,30,10,15,19));
    }
}
