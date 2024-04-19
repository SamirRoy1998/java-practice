package pkg1;
import java.util.Scanner;
public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name= sc.nextLine();
        System.out.print("Enter your total Annual Income: ");
        double income= sc.nextDouble();

        double taxableAmount=income-250000;

        double tax30=(taxableAmount/100)*30;
        double tax20=(taxableAmount/100)*20;
        double tax5=(taxableAmount/100)*5;
        double tax0 =taxableAmount*0;

//          Income Slab       Tax Rate
//          2.5L to 5L           5%
//            5L to 10L         20%
//           10L to Above       30%
//       Income Tax Exemption Limit 2.5L

//                need to fix the tax
        if (income>=1000000.00){
            System.out.println(name+" your taxes was "+tax30+"rs");
        } else if (income>=500000.00){
            System.out.println(name+" your taxes was "+tax20+"rs");
        } else if (income>=250000.00){
            System.out.println(name+" your taxes was "+ tax5 +"rs");
        } else
            System.out.println(name+" your taxes was "+tax0+"rs. Enjoy your life!!!");

    }
}
