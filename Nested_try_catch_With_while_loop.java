package pkg1;

import java.util.Scanner;

public class Nested_try_catch_With_while_loop {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        Scanner sc = new Scanner(System.in);
        boolean flag=true;

        while (flag){
            System.out.print("Enter the index no: ");
            int i = sc.nextInt();
            try {
                try {
                    System.out.println(arr[i]);
                    flag=false;
                    break;
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Entered index number isn't available");
                }
                finally {
                    System.out.println("Hello i am finally block");
                }
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        System.out.println("Thank you for using this program");
    }
}
