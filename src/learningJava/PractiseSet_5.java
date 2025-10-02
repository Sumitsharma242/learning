package learningJava;

import java.util.Scanner;
public class PractiseSet_5 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks in maths: ");
        int maths = sc.nextInt();

        System.out.println("Enter marks in English: ");
        int english= sc.nextInt();

        System.out.println("Marks in science: ");
        int science= sc.nextInt();

        int total= maths+english+science;
        int percentage= (total * 3) /100;
        System.out.println(percentage);

        if (maths>33 && english>33 && science>33 && percentage>40){
            System.out.println("Pass");
        }
        else System.out.println("Fail");
    }

}
