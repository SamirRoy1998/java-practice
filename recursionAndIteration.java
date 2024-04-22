package pkg1;

public class recursionAndIteration {
//    factorial (0) = 1
//    factorial (4) = 4*3*2*1 = 24
//    factorial (5) = 5*4*3*2*1 = 120
//    factorial (n) = n * n-1 *....1
//    factorial (n) = n * factorial(n-1)
    static int factorial (int n){           //-> Recursion
        if (n==0 || n==1) {
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
    static int factorial_iteration (int n){ //-> Iteration
        if (n==0 || n==1) {
            return 1;
        }
        else {
            int product = 1;
            for (int i=1; i<=n; i++){
                product *=i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        int x = 4;
        System.out.println("The value of factorial " +x+ " using recursion is: " + factorial(x));
        System.out.println("The value of factorial " +x+ " using iteration is: " + factorial_iteration(x));
    }
}