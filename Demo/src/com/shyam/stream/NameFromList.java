package com.shyam.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameFromList {
public static void main(String[] args) {
	List<Employee> emps=Arrays.asList(
			new Employee("John", "Doe", "IT",34343),
			new Employee("Eisita", "john", "HR",9434),
			new Employee("Alice", "Smith", "HR",43434),
			new Employee("sangam", "nishad", "Finance",4243),
			new Employee("John", "Smith", "Finance",4343),
			new Employee("Smaith", "Smith", "Finance",343),
			new Employee("Bob", "Brown", "IT",777),
			new Employee("stuart", "Brown", "IT",77)
			
			);
	String strName = emps.stream().map(Employee::getFirstName).collect(Collectors.joining("#"));
	
	System.out.println(strName);
}

}
