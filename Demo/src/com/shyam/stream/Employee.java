package com.shyam.stream;

public class Employee {
	private String firstName;
	private String lastName;
	private String department;
	private double salary;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String firstName, String lastName, String department,double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", department=" + department
				+ ", salary=" + salary + "]";
	}
	
	
	
}
