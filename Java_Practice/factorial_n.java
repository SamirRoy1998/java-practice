package pkg1.Java_Practice;

public class factorial_n {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
