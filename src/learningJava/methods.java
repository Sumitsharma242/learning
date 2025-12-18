package learningJava;

import java.util.Scanner;

public class methods {

    int sum(int a, int b){
    return a+b;
    }

//        static int sum(int a, int b){ // since the mentod is used in the same class we use static
//        return a+b;
//    }

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);  // object creation
        System.out.println("Enter the number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the number: ");
        int num2 = scanner.nextInt();
        methods obj= new methods();
        int result= obj.sum(num1,num2);
     //   int result= sum(num1,num2);  // static method call
        System.out.println("The sum of these two numbers is: "+ result);
    }
}
