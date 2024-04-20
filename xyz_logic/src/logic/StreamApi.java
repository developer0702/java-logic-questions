package logic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 5, 3, 4, 5, 6, 7, 8, 3, 9);

		// Find Even number by filter operations
		List<Integer> collect = list.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
		System.out.println(collect);

		// Find Even number by filter operations
		List<Integer> collect2 = list.stream().filter(s -> s % 2 != 0).collect(Collectors.toList());
		System.out.println(collect2);

		// multiply by 2 of all element by map operation
		List<Integer> collect3 = list.stream().map(s -> s * 2).collect(Collectors.toList());
		System.out.println(collect3);

		// sorted method apply
		List<Integer> collect4 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(collect4);

		// Remove duplicate element
		List<Integer> district = list.stream().distinct().collect(Collectors.toList());
		System.out.println(district);
		// sort of district data
		Collections.sort(district);
		System.out.println(district);

	}

}
