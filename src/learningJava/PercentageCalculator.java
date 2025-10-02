package learningJava;

import java.util.Scanner;

public class PercentageCalculator {
    public static void main (String[]args){
    Scanner sc= new Scanner(System.in);
        System.out.println("Enter the marks of subject1 out of 100: ");
    int a= sc.nextInt();
        System.out.print("Enter the marks of subject2 out of 100: ");
        int b= sc.nextInt();
        System.out.print("Enter the marks of subject3 out of 100: ");
        int c= sc.nextInt();
        System.out.print("Enter the marks of subject4 out of 100: ");
        int d= sc.nextInt();
        System.out.print("Enter the marks of subject5 out of 100: ");
        int e= sc.nextInt();

        float sum= a+b+c+d+e;
        float percentage = (sum /500)*100;
        System.out.print(" total percentage is: "+ percentage);

}
}
