package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		List<Student> lists= new ArrayList<Student>();
		lists.add(new Student(11,"sanjay",22000,"Hr","Male"));
		lists.add(new Student(111, "sanjay", 14000, "HR", "Male"));
		lists.add(new Student(211, "vikash", 50000, "Dev", "Male"));
		lists.add(new Student(301, "xaya", 3000, "Tester", "Female"));
		
		Collections.sort(lists);
		System.out.println(lists);
	}
}
