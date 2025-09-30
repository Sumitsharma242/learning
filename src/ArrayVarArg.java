public class ArrayVarArg {
    public static void main(String[] args) {
        sum(10,20,30);
    }
    public static void sum(int... x){
        int sum=0;
        for (int i:x) {
            sum+=i;
        }
        System.out.println("Sum of numbers is: "+sum);
    }
}
