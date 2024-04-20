package interviewinterview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VowelsFind {
	public static void main(String[] args) {

		String str = "aolreoanusileU U ";
		String lowerCase = str.toLowerCase();
		
		List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
		Map<Character, Long> result = lowerCase.chars().mapToObj(s -> (char) s).filter(vowels::contains)
				.collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		System.out.println(result);

	}
}
