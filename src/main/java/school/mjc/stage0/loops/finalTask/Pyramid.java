package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
// Loop through each row of the pyramid
        for (int i = 1; i <= cathetusLength; i++) {
            // Print spaces before the first asterisk in each row
            for (int j = 1; j <= cathetusLength - i; j++) {
                System.out.print(" ");
            }
            // Print asterisks in increasing order
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }


    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
