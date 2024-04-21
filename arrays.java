package pkg1;

public class arrays {
    public static void main(String[] args) {
//      There are Three main ways to create an Array in Java
//  --------------------------------------------------------------------------
//        NO 1. Declaration then Memory Allocation
//  --------------------------------------------------------------------------
//        ClassRoom1 of 10 Students
        int [] marks1;              /* --> Its Declaration          */
        marks1=new int[10];         /* --> Its Memory Allocation    */
        marks1[0]=89;               /* --> Its Initialization       */
        marks1[1]=74;               /* --> Its Initialization       */
        marks1[2]=54;               /* --> Its Initialization       */
        marks1[3]=45;               /* --> Its Initialization       */
        marks1[4]=48;               /* --> Its Initialization       */
        marks1[5]=79;               /* --> Its Initialization       */
        marks1[6]=49;               /* --> Its Initialization       */
        marks1[7]=81;               /* --> Its Initialization       */
        marks1[8]=83;               /* --> Its Initialization       */
        marks1[9]=90;               /* --> Its Initialization       */
//        Arrays can be overwritten
        marks1[8]=-3;               /* --> Its Initialization       */
        marks1[9]=100;              /* --> Its Initialization       */
        System.out.println(marks1[9]);
        System.out.println(marks1[8]);
        System.out.println(marks1[7]-1);
        System.out.println(marks1[6]/7);
//  --------------------------------------------------------------------------
//        NO 2. Declaration and Memory Allocation
//  --------------------------------------------------------------------------
//        ClassRoom2 of 10 Students
        int [] marks2 =new int[10];   /* --> Its Declaration and Memory Allocation*/
        marks2[0]=89;                 /* --> Its Initialization*/
        marks2[1]=74;                 /* --> Its Initialization*/
        marks2[2]=54;                 /* --> Its Initialization*/
        marks2[3]=45;                 /* --> Its Initialization*/
        marks2[4]=48;                 /* --> Its Initialization*/
        marks2[5]=79;                 /* --> Its Initialization*/
        marks2[6]=49;                 /* --> Its Initialization*/
        marks2[7]=81;                 /* --> Its Initialization*/
        marks2[8]=83;                 /* --> Its Initialization*/
        marks2[9]=90;                 /* --> Its Initialization*/
//        Arrays can be overwritten
        marks2[8]=-3;                 /* --> Its Initialization*/
        marks2[9]=100;                /* --> Its Initialization*/
        System.out.println(marks2[9]);
        System.out.println(marks2[8]);
        System.out.println(marks2[7]-1);
        System.out.println(marks2[6]/7);
//  --------------------------------------------------------------------------
//  --------------------------------------------------------------------------
//        NO 3. Declaration and Memory Allocation and Initialization together
//  --------------------------------------------------------------------------
//        ClassRoom of 10 Students
        int [] marks ={89,74,54,45,48,79,49,81,83,90,}; /* --> Its Declaration and Memory Allocation and Initialization together */
        System.out.println(marks[9]);
        System.out.println(marks[8]);
        System.out.println(marks[7]-1);
        System.out.println(marks[6]/7);
//-----------------------------------------------------------------------------
    }
}
