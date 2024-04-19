package pkg1;

public class StringMethods {
    public static void main(String[] args) {
//        NOTE! Strings are  Immutable
//        A String can not be change, but we can print we can duplicate and change and print them

        String MainString="   I am Samir   ";
        String Example="samirsamir";
        int value=MainString.length();
        String lowercase=MainString.toLowerCase();
        String UPPERCASE=MainString.toUpperCase();
        String trim=MainString.trim();

//        Example Are Below

        System.out.println(MainString);
        System.out.println(value);
        System.out.println(lowercase);
        System.out.println(UPPERCASE);
        System.out.println(trim);
        System.out.println(MainString.substring(3));
        System.out.println(MainString.substring(8));
        System.out.println(MainString.substring(3,8));
        System.out.println(MainString.replace('a','o'));
        System.out.println(MainString.replace("am","'m"));
        System.out.println(MainString.replace(" am","'m"));
        System.out.println(MainString.startsWith("I am"));
        System.out.println(MainString.startsWith("   I am"));
        System.out.println(MainString.endsWith("ir"));
        System.out.println(MainString.endsWith("ir   "));
        System.out.println(MainString.charAt(3));
        System.out.println(MainString.charAt(8));
        System.out.println(MainString.indexOf('a'));
        System.out.println(MainString.indexOf("am"));
        System.out.println(MainString.indexOf("amir"));
        System.out.println(Example.indexOf("ir"));
        System.out.println(Example.indexOf("ir",5));
        System.out.println(Example.indexOf("Hello"));
        System.out.println(Example.lastIndexOf("ir"));
        System.out.println(Example.lastIndexOf("ir",4));
        System.out.println(MainString.equals("   I am Samir   "));
        System.out.println(MainString.equals("   i am samir   "));
        System.out.println(MainString.equalsIgnoreCase("   i am samir   "));
        System.out.println(MainString.equalsIgnoreCase("   I AM SAMIR   "));
        System.out.println(MainString.equalsIgnoreCase("   I am SaMir   "));
    }
}
