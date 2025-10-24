package learningJava;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age= sc.nextInt();

        switch (age){
            case 18:
                System.out.println("you can have learning licence");
            break;
            case 21:
                System.out.println(" You can have the car licence");
            break;

            //As break is not used here, so it will continue to the next case
            // it is known as fall through
            case 35:
                System.out.println("your licence needs renewal");
            default:
                System.out.println("Enjoy :)");
            break;
        }
    }
}
