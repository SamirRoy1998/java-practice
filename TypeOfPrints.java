package pkg1;
import java.util.Scanner;

public class TypeOfPrints {
    public static void main(String[] args) {
//        use of printf/format both are same and println for new line
//        and usage of %d, %f, %c, %s
//        %d for int
//        %f for float
//        %c for char
//        %s for String

//        int i=12;
//        float f= 14.254f;
//        System.out.printf("The value of int is %d and value of float if %f", i, f);
//        System.out.println();
//        System.out.format("The value of int is %d and value of float if %f", i, f);


//        Usage of .2,/.3,/.8,/ 3.2,/ 8.3

//        int i=12;
//        float f= 14.254f;
//        System.out.printf("The value of int is %d and value of float if %f", i, f);
//        System.out.println();
//        System.out.format("The value of int is %d and value of float if %.2f", i, f);
//        System.out.println();
//        System.out.format("The value of int is %d and value of float if %8.1f", i, f);


//        printing data from user input but print only SINGLE WORD

//        Scanner sc1=new Scanner(System.in);
//        System.out.print("Type Something: ");
//        String st1=sc1.next();
//        System.out.println(st1);

//        Usage of .nextLine();
//        .nextLine use for printing data from user input WHOLE LINE

        Scanner sc1=new Scanner(System.in);
        System.out.print("Write a Later to print: ");
        String st1=sc1.nextLine();
        System.out.println(st1);

    }
}
