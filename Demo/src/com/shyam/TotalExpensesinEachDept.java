package com.shyam;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TotalExpensesinEachDept {
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
	Map<String, Double> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
			Collectors.summingDouble(Employee::getSalary)
			));
	collect.forEach((dept,sal)->{
		System.out.println(dept+" "+sal);
	});
}
}
