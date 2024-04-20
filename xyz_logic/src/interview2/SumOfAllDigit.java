package interview2;

import java.util.stream.IntStream;

// find sum of all digit 
public class SumOfAllDigit {
	public static void main(String[] args) {

		int number = 4567890;
		IntStream stream = String.valueOf(number).chars();

		int sum = stream.map(Character::getNumericValue).sum();
		System.out.println(sum);
	}
}
