package Classes;

public class imported_class {
    public /*final*/ void property(){
        System.out.println("imported_class constructor");
    }
}

/* If uncomment the final method then the exception for method overriding will be thrown */
/* As final methods cannot be overridden and it is used for security purpose only */
