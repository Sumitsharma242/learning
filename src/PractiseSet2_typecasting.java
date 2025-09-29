import java.util.Scanner;

public class PractiseSet2_typecasting {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grade to encrypt");
        String grade= sc.next();
        char ch = grade.charAt(0);
        char encrypted= (char) (ch + 8);
        System.out.println("Encrypted grade= " + encrypted);


            char decryption = (char) (encrypted - 8);
            System.out.println("Decrypted grade is= " + decryption);

    }

}
