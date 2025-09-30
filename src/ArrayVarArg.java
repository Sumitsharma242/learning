public class ArrayVarArg {
    public static void main(String[] args) {
        //    int []array={10,20,30};
/*        sum(1, new int []{10,20,30});
    }
    public static void sum(int y,int... x){
        int sum=0;
        for (int i:x) {
            sum+=i;
        }
        int z= sum-y;
        System.out.println("Sum of numbers is: "+z);
  */
        int[] a1 = {10, 20, 30};
        int[] a2 = {1, 2, 3};
        int[] a3 = {4, 5, 6};
        sum(a1, a2, a3);
    }
    public static void sum(int[]... x) {
        for (int []y:x)
            System.out.println(y[0]);
    }
}
