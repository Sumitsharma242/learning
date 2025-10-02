package learningJava;

public class mainMethod {

    public static void main(String[] args) {
        System.out.println("main method is running");
        main(new int[]{1,2,3});
    }
    // main method overloading but by default JVM will call the main method with String[] args
    public static void main(int[]... args){
        for (int[] x:args) {
            for (int y:x) {
                 System.out.println(y);
             }
        }
        System.out.println("submain function is running");
    }
}
