package pkg1;

public class QuestionsInArray {
    public static void main(String[] args) {
//    -------------------------------------
//    Create an array of five integers and calculate their sum
//    -------------------------------------
        int[] q1 = {10, 20, 30, 40, 78};
        System.out.print("The sum of this array is: ");
        int sum1 = 0;
        for (int element : q1) {
            sum1 = sum1 + element;
        }
        System.out.println(sum1);
//    -------------------------------------
//    Calculate the average number in this array
//    -------------------------------------
        double[] q2 = {10, 20, 30, 40, 78};
        System.out.print("The value of average number: ");
        double sum2 = 0;
        for (double element : q2) {
            sum2 = sum2 + element;
        }
        System.out.println(sum2 / q1.length);
//    -------------------------------------
//    Given integer is present or not?
//    -------------------------------------
        int[] q3 = {10, 20, 30, 40, 78};
        int givenInteger = 78;
        boolean isInArray = false;
        for (int element : q3){
            if (givenInteger == element){
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("Given Integer is present in the array");
        }
        else {
            System.out.println("Given Integer is not present in the array");
        }
//    -------------------------------------
//    Matrix Addition
//    -------------------------------------
        int [][] mat1 = {{11,72,13},
                         {44,45,76}};
        int [][] mat2 = {{67,52,47},
                         {31,72,11}};
        int [][] result= {{0, 0, 0},
                          { 0, 0, 0}};
        System.out.println("Matrix addition");
        for (int r=0; r<mat1.length; r++){  //row number of times
            for (int c=0; c<mat1[r].length; c++){   //colum number of times
                result[r][c] = mat1[r][c] + mat2[r][c] ;
                System.out.print(result[r][c]+" ");
            }
            System.out.println();
        }
//    -------------------------------------
//    Revering array
//    -------------------------------------
        int [] arr = {7, 2, 5, 8, 1, 10};
        int l = arr.length;
        int hl = Math.floorDiv(l, 2);
        int temp;
        System.out.println("Array is now reverse");

        for(int i=0; i<hl; i++){
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for (int element:arr){
            System.out.print(element+" ");
        }
        System.out.println("\nExample: "+arr[2]); //before index no 2=5 but now index no 2=8

    }
}
