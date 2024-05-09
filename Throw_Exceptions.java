package pkg1;

import java.util.Scanner;

public class Throw_Exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        try{
            b= 18/a;
            if (b==0){
                throw new ArithmeticException("Try less than 18");
            }
        }
        catch (ArithmeticException e){
            b= 18/1;
            System.out.println(e.toString());
            System.out.print("Default output is: ");
        }
        catch (Exception e ){
            System.out.println(e);
        }
        System.out.println(b);
    }
}
