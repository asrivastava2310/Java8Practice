package com.java8dev.practice.functionalinterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.java8dev.practice.utils.Employee;
import com.java8dev.practice.utils.EmployeeLocalDB;

public class BiFunctionExample {

	private static BiFunction<List<Employee>, Predicate<Employee>, Map<String, Integer>> highestRatedEmployees = (
			employees, employeePredicate) -> {
		Map<String, Integer> namesAndRating = new HashMap<>();
		employees.forEach((employee) -> {
			if (employeePredicate.test(employee)) {
				namesAndRating.put(employee.getName(), employee.getRating());
			}
		});
		return namesAndRating;
	};

	private static Predicate<Employee> employeePredicate = (employee)->employee.getRating() == 3;
	
	public static void main(String[] args) {
       List<Employee> employees = EmployeeLocalDB.getAllEmployees();
       System.out.println(highestRatedEmployees.apply(employees, employeePredicate));
	}

}
