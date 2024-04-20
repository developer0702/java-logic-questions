package logic;

public class IntReverse {
	
	public static void main(String[] args) {

		int x = 1234;

		String string = Integer.toString(x);
		String reverse = new StringBuffer(string).reverse().toString();

		int parseInt = Integer.parseInt(reverse);
		System.out.println(parseInt);

	}

}
