package com.shyam;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeStreamGrouping {
public static void main(String[] args) {
	List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", 60000, "IT"),
            new Employee(2, "Bob", 45000, "HR"),
            new Employee(3, "Charlie", 70000, "Finance"),
            new Employee(4, "David", 55000, "IT"),
            new Employee(5, "Eve", 40000, "Marketing"),
            new Employee(6, "Frank", 48000, "HR"),
            new Employee(7, "Grace", 75000, "Finance")
        );
	
	Map<String, List<String>> deptAndName = employees.stream().collect(
			Collectors.groupingBy(Employee::getDepartment,
					Collectors.mapping(Employee::getName, Collectors.toList())
					)
			);
	System.out.println("Employees Grouped By Department");
	
	deptAndName.forEach((dept,names)->{
		System.out.println(dept+ "  "+names);
	});
	System.out.println("Average Salary by Department");
	Map<String, Double> avgSal = employees.stream().collect(
			Collectors.groupingBy(Employee::getDepartment,
					Collectors.averagingDouble(Employee::getSalary)
					)
			);
	avgSal.forEach((dept,avgSalary)->{
		System.out.println(dept+" "+avgSalary);
	});
}
}
