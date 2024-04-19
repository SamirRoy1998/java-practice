package pkg1;
import java.util.Scanner;

public class KmToMile {
    public static void main(String[] args) {
       double km;
        System.out.println("Please enter Kilomiters");
        Scanner scnr1=new Scanner(System.in);
//      Note  Snanner "scnr1"= km="scnr1" scn1 is scanner name
        km=scnr1.nextDouble();
        double ml=km/1.60934;
        System.out.println(km +" Kilometer =Approx "+ ml + " Miles");
    }
}