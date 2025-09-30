public class ArrayVarArg {
    public static void main(String[] args) {
        int []array={10,20,30};
        sum(1, array);
    }
    public static void sum(int y,int... x){
        int sum=0;
        for (int i:x) {
            sum+=i;
        }
        int z= sum-y;
        System.out.println("Sum of numbers is: "+z);
    }
}
