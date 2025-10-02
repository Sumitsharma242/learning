package learningJava;

public class cmdLineArguments {
    // in this input is taker from the command line based on what is the input actions can be take out
//    public static void main(String[] args){
//        int n= Integer.parseInt(args[0]);
//                System.out.println("The square of "+n+" is "+n*n);
//    }

//------------------------------------------
    // this is to print the command line arguments without any action
    public static void main(String[] args){
        for (int i=0;i<args.length;i++){
            System.out.println("The argument at "+i+" is "+args[i]);
        }
    }
}
