package chapter8;

public class StringMethods {

    public static void main(String args[])
    {
        //splitString();
        //trimString();
        concatString();
    }

    public static void splitString(){
        String str = "gee@kss@for@gee@kss";
        String[] arrOfStr = str.split("k", -1);

        System.out.println("Splitted string is: ");
        for (String a : arrOfStr)
            System.out.println("'" + a + "'");

        System.out.println();
    }

    public static void trimString(){
        // trims the trailing and leading spaces
        String s1 = " geeks for geeks has all java functions to read  ";
        System.out.println("Original string is: " + "'" + s1 + "'");
        System.out.println("Trimmed string is: " + "'" + s1.trim() + "'");

        // trims the leading spaces
        String s2 = " Chetna loves reading books";
        System.out.println("Original string is: " + "'" + s2 + "'");
        System.out.println("Trimmed string is: " + "'" + s2.trim() + "'");
    }

    public static void concatString(){
        String str1 = "Hello";
        String str2 = " World!";

        str1 = str1.concat(str2);
        System.out.println(str1);
    }
}
