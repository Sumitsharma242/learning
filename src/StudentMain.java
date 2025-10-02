// this method is getting and setting the data in GetterAndSetter class.
// this is the feature of encapsulation

public class StudentMain{
    public static void main(String[] args){
        GetterAndSetter student1= new GetterAndSetter();
        student1.setName("Sumit");
        student1.setAge(24);
        System.out.println("The name of the student is: "+ student1.getName());
        System.out.println("The age of the student is: "+ student1.getAge());
    }
}
