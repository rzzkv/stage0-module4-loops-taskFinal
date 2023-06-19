package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        // Loop through each row of the pyramid
        for (int i = 1; i <= cathetusLength; i++) {
            // Print spaces before the first number in each row
            for (int j = 1; j <= cathetusLength - i; j++) {
                System.out.print(" ");
            }
            // Print the numbers in each row
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }


    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
