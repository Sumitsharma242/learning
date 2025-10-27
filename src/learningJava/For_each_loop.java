package learningJava;

public class For_each_loop {
    public static void main(String[] args) {
        int[][] numbers = {{2, 3, 4, 5},{10,20,30,40}};
        // with this we can print 2D array using for each loop

        for (int[] number : numbers) {
            for (int test:number) {
                System.out.println(test);
            }
        }
        // with this we can print 3D array using for each loop

          int [][][]x = {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}},{{13,14,15},{16,17,18}}};
        for (int[][] y:x) {
            for (int[] z:y) {
                for (int a:z) {
                    System.out.println("This is the output form 3d array"+a);
                }
            }
        }
    }
}
