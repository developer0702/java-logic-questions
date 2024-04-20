package interviewinterview;

import java.util.Map;
import java.util.stream.Collectors;

public class CountChar {
	public static void main(String[] args) {
		String str = "hascd iAH U";
		String lowerCase = str.toLowerCase();

		Map<Character, Long> collect = lowerCase.chars().mapToObj(s -> (char) s)
				.collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		System.out.println(collect);

	}

}
