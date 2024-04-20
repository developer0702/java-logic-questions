package logic;

import java.util.Map;
import java.util.stream.Collectors;

public class CountChar {

	public static void main(String[] args) {

		String str="abcdefghij";
		Map<Character, Long> collect = str.chars().mapToObj(s->(char)s).collect(Collectors.groupingBy(s->s,Collectors.counting()));
		System.out.println(collect);
	}
}
