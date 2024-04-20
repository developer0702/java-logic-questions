package logic;

import java.time.LocalDate;
import java.time.Period;

// find year difference between current date and specified date
public class DateCurrentFIndDiffYear {

	public static void main(String[] args) {
		LocalDate dob = LocalDate.parse("1994-02-07");
		LocalDate currentDate = LocalDate.now();
		Period between = Period.between(dob, currentDate);
		System.out.println("differnce year: "+between.getYears());
		System.out.println(between.getMonths());
		System.out.println(between.getDays());

	}
}
