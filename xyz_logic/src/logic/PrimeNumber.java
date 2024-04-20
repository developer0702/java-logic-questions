package logic;

public class PrimeNumber {
	public static void main(String[] args) {
		int x = 100;
		for (int i = 0; i < x; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	private static boolean isPrime(int x) {

		if (x < 1) {
			return false;
		}
		for (int i = 2; i * i <= x; i++) {

			if (x%i==0) {
				return false;
			}
		}
		return true;
	}
}
