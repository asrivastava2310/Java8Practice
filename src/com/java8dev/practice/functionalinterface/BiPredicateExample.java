package com.java8dev.practice.functionalinterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

import com.java8dev.practice.utils.Employee;
import com.java8dev.practice.utils.EmployeeLocalDB;

public class BiPredicateExample {
	
	private static BiPredicate<Integer, List<String>> highestRatedAndAwsEnabled = (rating, certificates) -> {
		return rating == 3 && certificates.contains("AWS");
	};
	
	private static BiConsumer<String, List<String>> employeeBiConsumer = (name, certificates) -> System.out.println(name + " " + certificates);
	
	private static Consumer<Employee> employeConsumer = (employee) -> {
		if (highestRatedAndAwsEnabled.test(employee.getRating(), employee.getCertificates())) {
			employeeBiConsumer.accept(employee.getName(), employee.getCertificates());
		}
	};

	public static void main(String[] args) {
		List<Employee> employees = EmployeeLocalDB.getAllEmployees();
		printHighestRatedAndAWSEnabled(employees);
	}

	private static void printHighestRatedAndAWSEnabled(List<Employee> employees) {
		employees.forEach(employeConsumer);
	}

}
