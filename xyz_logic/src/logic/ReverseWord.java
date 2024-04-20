package logic;

public class ReverseWord {
	public static void main(String[] args) {
		String str = "new delhi";
		String[] split = str.split(" ");

		StringBuilder builder = new StringBuilder();
		for (int i = split.length - 1; i >= 0; i--) {
			builder.append(split[i]).append(" ");

		}
		System.out.println(builder);
	}
}
