package pkg1.Java_Practice;

public class Percentage {
    public static void main() {
        int s1 = 48;
        int s2 = 23;
        int s3 = 25;
        int s4 = 34;
        int s5 = 41;
        int s6 = 20;
        double outOf = 50;
        double totalOutOf = outOf * 6;
        double total = s1 + s2 + s3 + s4 + s5 + s6;
        double percentage = (total / totalOutOf) * 100;
        System.out.format("%.2f", percentage);
    }
}
