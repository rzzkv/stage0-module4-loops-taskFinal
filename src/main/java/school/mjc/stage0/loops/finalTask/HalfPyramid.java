package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= cathetusLength - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
                if (k < i) {
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        new HalfPyramid().printHalfPyramid(8);
    }
}

/*
 // Loop through each row
        for (int i = 1; i <= cathetusLength; i++) {
            // Loop through each column in the row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
 */