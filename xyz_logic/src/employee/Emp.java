package employee;


public class Emp {

	private int empId;
	private String name;
	private double salary;
	private String department;
	private String gender;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
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
	public Emp(int empId, String name, double salary, String department, String gender) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ ", gender=" + gender + "]";
	}
	
	
}
