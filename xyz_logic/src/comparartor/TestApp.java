package comparartor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestApp {
	public static void main(String[] args) {
		List<Student> lists = new ArrayList<Student>();
		lists.add(new Student(111, "sanjay", 14000, "HR", "Male"));
		lists.add(new Student(211, "vikash", 50000, "Dev", "Male"));
		lists.add(new Student(301, "xaya", 3000, "Tester", "Female"));
		
		Collections.sort(lists,new NameComparator());
		System.out.println(lists);
		Collections.sort(lists,new SalaryComparator());
		
		System.out.println(lists);
	}

}
