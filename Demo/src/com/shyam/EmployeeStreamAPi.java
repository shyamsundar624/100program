package com.shyam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStreamAPi {
	
public static void main(String[] args) {
	
	List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", 60000, "IT"),
            new Employee(2, "Bob", 45000, "HR"),
            new Employee(3, "Charlie", 70000, "Finance"),
            new Employee(4, "David", 55000, "IT"),
            new Employee(5, "Eve", 40000, "Marketing")
        );
	
	List<String> result = employees.stream()
	.filter(e->e.getSalary()>50000)
	.sorted((e1,e2)->Double.compare(e2.getSalary(), e1.getSalary()))
	.map(Employee::getName)
	.collect(Collectors.toList());
	
	System.out.println(result);
}

}
