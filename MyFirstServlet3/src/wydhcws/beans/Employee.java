package wydhcws.beans;

public class Employee {
	private Integer id;
	private String lastName;
	private String email;
	private Double salary;
	private String dept;

	public Employee() {
	}

	public Employee(Integer id, String lastName, String email, Double salary, String dept) {
		this.id = id;
		this.lastName = lastName;
		this.email = email;
		this.salary = salary;
		this.dept = dept;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalary() {
		return this.salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDept() {
		return this.dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String toString() {
		return "Employee [id=" + this.id + ", lastName=" + this.lastName + ", email=" + this.email + ", salary="
				+ this.salary + ", dept=" + this.dept + "]";
	}
}