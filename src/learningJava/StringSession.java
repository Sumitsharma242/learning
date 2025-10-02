package learningJava;

import java.util.Scanner;


public class StringSession {
    public static void main (String[] args){
//        String name= "Sumit";
  //      System.out.println(name);

    //String name= new String("Sumit");
      //  System.out.println(name);


// note: index will always start from zero
    Scanner sc= new Scanner(System.in);
    String str= sc.nextLine();
        System.out.println(str);
        int value= str.length();
        System.out.println(value);
        String L_string= str.toLowerCase();
        System.out.println(L_string);
        String trimmed= str.trim();
        System.out.println(trimmed);
        System.out.println(str.substring(5));
        System.out.println(str.substring(2,4));
        System.out.println(str.replace('S','P'));
        System.out.println(str.startsWith("My"));
        System.out.println(str.endsWith("ama"));
        System.out.println(str.charAt(4));
        System.out.println(str.indexOf("name"));
        System.out.println(str.indexOf("S",1));
        System.out.println(str.equals("sumit"));
        System.out.println(str.equalsIgnoreCase("sumit"));

        //Escape character
        System.out.println("My name is \n\"Sumit Sharma\"");
    }
}
