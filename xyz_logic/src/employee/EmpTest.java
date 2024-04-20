package employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmpTest {

	public static void main(String[] args) {
		List<Emp> emps = getAllEmployee();
		
		// count gender
		Map<String, Long> collect = emps.stream().collect(Collectors.groupingBy(Emp::getGender,Collectors.counting()));
		System.out.println(collect);
		
		// find max salary
		Optional<Emp> max = emps.stream().max(Comparator.comparing(Emp::getSalary));
		System.out.println(max);
		
		// find count no of department
		Map<String, Long> collect2 = emps.stream().collect(Collectors.groupingBy(Emp::getDepartment,Collectors.counting()));
		System.out.println(collect2);
		// find no of department
		List<String> collect3 = emps.stream().map(s->s.getDepartment()).collect(Collectors.toList());
		System.out.println(collect3);
		
		
	}

	private static List<Emp> getAllEmployee() {
		List<Emp> listOfEmp = new ArrayList<Emp>();
		listOfEmp.add(new Emp(111, "sanjay", 15000, "Hr", "male"));
		listOfEmp.add(new Emp(321, "vikash", 25000, "Dev", "male"));
		listOfEmp.add(new Emp(22, "rani", 36000, "Tester", "female"));

		return listOfEmp;
	}

}
