package Classes;

public class import_class extends imported_class {

    public static void main(String[] args) {
        System.out.println("import_class main method executed");
        imported_class p = new imported_class();
        p.property();
        imported_class_second p2 = new imported_class_second();
        p2.property();
    }
}
