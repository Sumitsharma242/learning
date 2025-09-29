import java.util.Scanner;

public class KmToMiles {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Km");
        float km= sc.nextFloat();

        double miles= 1.609344* km;
        System.out.println(km + " km ="+ miles +" miles");

    }
}
