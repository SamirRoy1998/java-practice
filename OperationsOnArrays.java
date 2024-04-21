package pkg1;

public class OperationsOnArrays {
    public static void main(String[] args) {
        int [] arr ={10,20,30,40};
        System.out.println("Int Array's Length: "+ arr.length);
        System.out.println("Displaying Int Array Using Simple Methods");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println("Displaying Int Array Using For Loop");
                for (int fl=0; fl<arr.length; fl++){
                    System.out.println(arr[fl]);
        }
        System.out.println("Third int in this array: "+ arr[2] + "\n");


        String [] nnn ={"Ram", "Sham", "Harry", "John"};
        System.out.println("First String in this array: "+ nnn[0]);
        System.out.println("Displaying Sting Array Using For Loop in Reverse order");
                for (int fl=nnn.length -1; fl>=0; fl--){
                    System.out.println(nnn[fl]);
        }
        System.out.println("Displaying Sting Array Using Enhanced For Loop");
                for (String EnFl:nnn){
                    System.out.println(EnFl);
                }
        System.out.println("String Array's Length: "+ nnn.length + "\n");
    }
}