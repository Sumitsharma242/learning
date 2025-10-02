package learningJava;

public class mainMethodPart2 {

    // this came in the 1.7 version of java where the main is found and then identify the static block,
    //then while execute the static block, then the main method
    // but while the output is first the static block and then the main method
    static{
        System.out.println("This is the static block");
    }
    public static void main(String[] args){
        System.out.println("This is the main method");
    }
}
