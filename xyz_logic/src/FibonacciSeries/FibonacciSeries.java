package FibonacciSeries;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println("input here");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		fibonacci(x);
	}

	private static void fibonacci(int x) {
		int a = 0, b = 1;
		for (int i = 0; i < x; i++) {
			System.out.print(a + " ");
			int nextTerm = a + b;
			a = b;
			b = nextTerm;
		}

	}

}
