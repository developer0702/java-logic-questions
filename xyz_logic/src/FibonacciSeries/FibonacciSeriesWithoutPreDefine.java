package FibonacciSeries;


import java.util.Scanner;

public class FibonacciSeriesWithoutPreDefine {
    public static void main(String[] args) {
        System.out.println("Enter the number of terms in the Fibonacci series:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < x; i++) {
           int fibonacci = fibonacci(i);
           System.out.print(fibonacci+" ");
           
        }
    }

    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

