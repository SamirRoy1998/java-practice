package pkg1;

public class Fibonacci_Sequence {
    static int fib(int n){
        if (n==1||n==2){
            return n-1;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[] args) {
//      Fibonacci sequence - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        int result=fib(10); //  the 10th no Fibonacci number is 34
        System.out.println(result);
    }
}
