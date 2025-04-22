package com.shyam.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDepartment {
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
	
	Map<String, List<Employee>> map = emps.stream().collect(Collectors.groupingBy(Employee::getDepartment));
	map.forEach((key,value)->{
		System.out.println(key+" "+value);
	});
}
}
