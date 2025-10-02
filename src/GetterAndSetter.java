// this is the concept of the encapsulation where private variables are accessible only through the public methods
// and hence the main method who is accessing there variables is in StudentMain class/.javafile

public class GetterAndSetter {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age){
        this.age= age;
    }
    public int getAge(){
        return age;
    }
}

