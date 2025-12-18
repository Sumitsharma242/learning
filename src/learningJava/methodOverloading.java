package learningJava;

public class methodOverloading {

    static void change(int[] arr){
        arr[0]= 100;
    }

    static int varargs(int ...arr){
        int result=0;
        for (int a:arr) {
            result+=a;
        }
        return result;
    }


    static void change(){
        System.out.println("Why did the chicken cross the road?" +
                "To get to the other side.");
    }
    
    public static void main(String[] args){
            change();

            int [] marks= {10,20,30,40,50};
            change(marks);  // here we are calling the method with array parameter
            for (int x:marks) {
                System.out.println(x);
            }
    }

}
