package learningJava;

import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter you age: ");
        int age= sc.nextInt();
        System.out.println("Enter vehical type");
        String vehicle= sc.next();
        if (age>18 && vehicle.equals("Car")) {
            System.out.println("You can drive car");
        }else
            System.out.println("You cannot drive car");
    }
}
