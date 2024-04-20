package logic;

public class OddEven {
	public static void main(String[] args) {

		int x = 100;
		System.out.println("this is a even number");
		for (int i = 0; i < x; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\nthis is a odd number");
		for (int i = 0; i < x; i++) {
			if (i%2!=0) {
				System.out.print(i+" ");
			}
		}
	}
}
