package learningJava;
//public class Student {
//}
//public class test{
//}
//public class temp{
//
//}
public class New_And_newInstance {
    public static void main(String[] args) throws Exception{
        Object o= Class.forName (args[0]).newInstance() ;
        System.out.println("Created object is " + o.getClass().getName());
    }
}
