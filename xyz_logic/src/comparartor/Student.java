package comparartor;

public class Student {

	private int studentId;
	private String name;
	private double salary;
	private String department;
	private String gender;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", salary=" + salary + ", department="
				+ department + ", gender=" + gender + "]";
	}
	public Student(int studentId, String name, double salary, String department, String gender) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.gender = gender;
	}
	
	
}
