package learningJava;

public class While_loop {
    public static void main(String[] args){
        int a=20,b=10;
        // while loop is used when we don't know the number of iterations
        // while loop will run until the condition is true
        // if a is less than b then the loop will run infinitely

        while (a<b){
            System.out.println(a);
        }
        System.out.println("The loop is done");
    }
}

class  Do_while {
    public static void main(String[] args){
        int a=20,b=10;
        // do while loop is used when we want to execute the loop at least once
        // do while loop will run at least once even if the condition is false

        do {
            System.out.println(a);
        }while (a<b);
        System.out.println("The loop is done");
    }
}


