package interviewinterview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
// find second highest number
public class FindSecondHighestValue {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 45, 67, 8, 73);
		Integer result = list.stream()
				.sorted(Comparator.reverseOrder())
				.skip(1).findFirst().get();
		System.out.println(result);
	}
}
