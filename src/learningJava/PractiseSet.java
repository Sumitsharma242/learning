package learningJava;

import java.util.Scanner;


public class PractiseSet {

    public static void main(String[] args){
     // write a program to print * in console in upside down form
/*
        int n=5;
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
            System.out.print("*");
           }
            System.out.println();
        }
    }*/
    // write a program to sum first n even numbers using while loop
  /*      int sum=0;
        int n=3;
        for (int i=1;i<=n;i++){
            sum=sum +(2*n);

        }
        System.out.println(sum);

   */
        // write a program to print multiplication table of 10 in reverse order
       int n=10;
       int sum=0;
           for(int j=n;j>=1;j--){
               sum= sum+ (10*j);
               System.out.println(sum);
              // System.out.println("10 * "+j+" = "+(10*j)) ;
           }

        // Write a program to find factorial of a given number using while loop
   /*     Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        int fact=1;
        while (n>0){
            fact=fact*n;
            n--;
        }
        System.out.println("Factorial of "+n+" is "+fact);*/
       }
}

