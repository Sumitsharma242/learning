package learningJava;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age= sc.nextInt();

        switch (age){
            case 18 ->{
                System.out.println("you can have learning licence");
            }
            case 21->{
                System.out.println(" You can have the car licence");
            }
            case 35->{
                System.out.println("your licence needs renewal");
            }
            default->{
                System.out.println("Enjoy :)");
            }
        }
    }
}
