package pkg1;
import java.util.Scanner;

public class OldAndNewIncomeTaxesCalculator {
    public static double getOldTax(double Income)
    {
        if (Income <= 500000) {
            return 0;
        }
        if (Income <= 1000000) {
            return (Income - 500000) * 0.2
                    + (250000 * 0.05);
        }
        return (Income - 1000000) * 0.3 + (500000 * 0.2)
                + (250000 * 0.05);
    }

    public static double getNewTax(double Income)
    {
        if (Income <= 700000) {
            return 0;
        }
        if (Income <= 750000) {
            return (250000 * 0.05)
                    + (Income - 500000) * 0.1;
        }
        if (Income <= 1000000) {
            return (250000 * 0.05) + (250000 * 0.10)
                    + (Income - 750000) * 0.15;
        }
        if (Income <= 1250000) {
            return (250000 * 0.05) + (250000 * 0.10)
                    + (250000 * 0.15)
                    + (Income - 1000000) * 0.2;
        }
        if (Income <= 1500000) {
            return (250000 * 0.05) + (250000 * 0.10)
                    + (250000 * 0.15) + (250000 * 0.2)
                    + (Income - 1250000) * 0.25;
        }
        return (250000 * 0.05) + (250000 * 0.10)
                + (250000 * 0.15) + (250000 * 0.2)
                + (250000 * 0.25) + (Income - 1500000) * 0.3;
    }

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);

        System.out.print("Enter your name: ");
        String Name= Sc.nextLine();

        System.out.print("Enter your annual Income: ");
        double Income= Sc.nextFloat();

        double ots = getOldTax(Income);
        double nts = getNewTax(Income);

        System.out.print(Name );
        System.out.format( " using the old tax slab your tax amount is : %.2f",ots );
        System.out.println(" Rs");

        System.out.print(Name );
        System.out.format( " using the new tax slab your tax amount is : %.2f",nts);
        System.out.println(" Rs");

    }
}
