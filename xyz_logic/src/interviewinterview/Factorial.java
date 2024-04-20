package interviewinterview;

public class Factorial {
    public static void main(String[] args) {

        int n = 4;
        long factorial = 1;

        // Start the loop from 1
        for (int i = 1; i <= n; i++) {
            // Multiply the current value of factorial by i
            factorial *= i;
        }

        System.out.println("factorial of " + n + ": " + factorial);
    }
}
