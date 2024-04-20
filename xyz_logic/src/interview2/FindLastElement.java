package interview2;

import java.util.Arrays;
import java.util.List;

public class FindLastElement {
	public static void main(String[] args) {

		// find last word/digit
		List<String> list = Arrays.asList("one", "two", "john", "raj");
		String lastDigit = list.stream().skip(list.size() - 1).findFirst().get();
		System.out.println(lastDigit);

	}
}
