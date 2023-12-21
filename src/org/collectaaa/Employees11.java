package org.collectaaa;

public class Employees11 {
	private String name;
	private String date;
	private String designation;
	private int salary;
	private int depatmentId;

	public Employees11(String name, String date, String designation, int salary, int departmentId) {
		this.name=name;
		this.salary=salary;
		this.designation=designation;
		this.date=date;
		this.depatmentId=departmentId;
		
}

	@Override
	public String toString() {
		return "Employees11 [name=" + name + ", date=" + date + ", designation=" + designation + ", salary=" + salary
				+ ", depatmentId=" + depatmentId + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getDepatmentId() {
		return depatmentId;
	}

	public void setDepatmentId(int depatmentId) {
		this.depatmentId = depatmentId;
	}

}
