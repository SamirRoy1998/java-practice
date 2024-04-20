package pkg1;

public class Stars {
    public static void main(String[] args) {
//        Merging Stars
        int n1=10;
        for (int i=n1; i>0; i--) {
            for (int stars=0; stars<i; stars++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
//        Expanding Pandemic
        int n2=10;
        for (int i=0; i<n2; i++) {
            for (int corona=0; corona<i; corona++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

