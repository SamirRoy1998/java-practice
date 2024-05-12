package pkg1.Java_Practice;

import java.util.Scanner;

public class Output_with_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNumber = 1;
        while (sc.hasNext()) {
            String text = sc.nextLine();
            System.out.println(lineNumber + " " + text);
            lineNumber++;
            if (lineNumber > 5) break;
        }
    }
}
