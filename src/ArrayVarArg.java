public class ArrayVarArg {public class ArrayVarArgMethod {
    public static void main(String[] args) {
        sum(10,20,30 );
    }
    public static void sum(int... x){
        int total =0;
        for (int x1:x){
            total= total+ x1;
        }
        System.out.println(total);
    }
}
}
