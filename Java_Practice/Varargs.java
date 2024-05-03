package pkg1.Java_Practice;

public class Varargs {
    static int sum(int... arr) {    //Available as (int[]arr)
        int result = 0;
        for (int e : arr) {
            result += e;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(1,5,6,8));
    }
}
