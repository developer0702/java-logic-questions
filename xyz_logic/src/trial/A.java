package trial;

import java.time.LocalDate;
import java.time.Period;

public class A {
	public static void main(String[] args) {

		LocalDate dobDate = LocalDate.parse("1995-02-07");
		LocalDate currentDate = LocalDate.now();
		Period between = Period.between(dobDate, currentDate);
		System.out.println(between.getYears());
		System.out.println(between.getMonths());
		
		
		
	}
}
