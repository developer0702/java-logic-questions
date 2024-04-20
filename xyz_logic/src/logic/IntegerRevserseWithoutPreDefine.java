package logic;

public class IntegerRevserseWithoutPreDefine {
	public static void main(String[] args) {

		int x = 123456789;
		int reverse = reverseInt(x);
		System.out.println(reverse);
	}

	private static int reverseInt(int x) {
		int reversed = 0;
		while (x != 0) {
			int digit = x % 10;
			reversed = reversed * 10 + digit;
			x /= 10;
		}
		return reversed;
	}
}
