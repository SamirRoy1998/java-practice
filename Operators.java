package pkg1;

public class Operators {
    public static void main(String[] args) {
//        Example of Modulo Operator
//      % is Modulo Operator 6%4=2, How 4*1=4 and 6-4=2
        int M1=6%4;
        System.out.println(M1);

//      % is Modulo Operator 12%7=5, How 7*1=7 and 12-7=5
        int M2=12%7;
        System.out.println(M2);

//      % is Modulo Operator 25%9=7, How 9*2=18 and 25-18=7
        int M3=25%9;
        System.out.println(M3);

//      % is Modulo Operator 1545%=8, How 8*193=1544 and 1545-1544=1
        int M4=1545%8;
        System.out.println(M4);

//        Example of Assignment Operator
//        += is Assignment Operator A1=10 then +4= 14
        int A1=10;
            A1+=4;
        System.out.println(A1);

//        *= is Assignment Operator A2=42 then *2= 84
        int A2=42;
            A2*=2;
        System.out.println(A2);

//        -= is Assignment Operator A3=42 then -2= 40
        int A3=42;
            A3-=2;
        System.out.println(A3);

//        /= is not Assignment Operator it shows error
//        int A3=69;
//            A3/=3;
//        System.out.println(A3);

//        Example of Comparator Operator
//        == its show true or false, 6=6 true
        System.out.println(6==6);
//        == its show true od false, 8 not=6 false
        System.out.println(8==6);

//        < its also show true false, 10<20 true
        System.out.println(10<20);
//        < its also show true false, 20<10 false
        System.out.println(20<10);
//        < its also show true false, 20<20 false
        System.out.println(20<20);

//        > its also show true false, 10>20 false
        System.out.println(10>20);
//        > its also show true false, 20>10 true
        System.out.println(20>10);
//        > its also show true false, 20>20 false
        System.out.println(20>20);

//        Example of Logical Operator
//        && is logical Operators, is 64>5 true 64>60 true then true
        System.out.println(64>5 && 64>60);
//        && is logical Operators, is 64>5 true 64<60 false then false,
//        NOTE if one condition false then false
        System.out.println(64>5 && 64<60);

//        || is logical Operators, is 64>5 true 64>60 true both condition then true
//        NOTE if one condition true then false
        System.out.println(64>5 || 64>60);
//        || is logical Operators, is 64>5 true 64<60 false one condition true then true,
        System.out.println(64>5 || 64<60);
//        || is logical Operators, is 64<5 false 64<60 false both condition false then false,
        System.out.println(64<5 || 64<60);

    }
}
