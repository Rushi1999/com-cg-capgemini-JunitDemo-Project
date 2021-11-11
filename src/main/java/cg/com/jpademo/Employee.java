package cg.com.jpademo;

public class Employee {
	
	
	private int eid;
	private String firstname;
	private double salary;
	
	public Employee() {
		super();
	}
	
	public Employee( String firstname, double salary) {
		super();
		this.firstname = firstname;
		this.salary = salary;
	}
	
	public Employee(int eid, String firstname, double salary) {
		super();
		this.eid = eid;
		this.firstname = firstname;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", firstname=" + firstname + ", salary=" + salary + "]";
	}

}
