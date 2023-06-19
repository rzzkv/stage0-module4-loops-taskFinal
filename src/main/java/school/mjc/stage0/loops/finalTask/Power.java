package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
// Initialize the result to 1
        int result = 1;
        // Multiply the number by itself 'power' times using a for loop
        for (int i = 0; i < power; i++) {
            result *= numberToPrint;
        }
        // Print the result
        System.out.printf(String.valueOf(power));
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
