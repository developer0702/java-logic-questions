package interview2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FindSecondHighNo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(87, 11, 23, 44, 32, 45, 24, 22, 45, 25, 76);
		Collections.sort(list);
		Integer result = list.stream().sorted(Comparator.reverseOrder())
				.skip(1).findFirst().get();
		System.out.println(result);

	}
}
