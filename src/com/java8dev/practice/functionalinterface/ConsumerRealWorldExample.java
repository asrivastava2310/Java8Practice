package com.java8dev.practice.functionalinterface;

import java.util.List;
import java.util.function.Consumer;
import com.java8dev.practice.utils.Employee;
import com.java8dev.practice.utils.EmployeeLocalDB;

public class ConsumerRealWorldExample {

	public static void main(String[] args) {
		printNames();
		printNamesAndCertifications();
		printMostRatedEmployees();
	}

	public static void printNames() {
		System.out.println("\nPrinting all employees ==============================>");
		Consumer<Employee> c1 = (e) -> System.out.println(e);
		List<Employee> employees = EmployeeLocalDB.getAllEmployees();
		employees.forEach(c1);
		// consumer -> (e) -> System.out.println(e)
	}

	public static void printNamesAndCertifications() {
		System.out.println("\nPrinting employees' names and their certificates ==============================>");
		Consumer<Employee> c2 = (e) -> System.out.print(e.getName());
		Consumer<Employee> c3 = (e) -> System.out.println(e.getCertificates());
		List<Employee> employees = EmployeeLocalDB.getAllEmployees();
		employees.forEach(c2.andThen(c3)); // This is Consumer chaining
	}

	public static void printMostRatedEmployees() {
		System.out.println("\nPrinting highest rated employees ==============================>");
		Consumer<Employee> c4 = (e) -> {
			if (e.getRating() == 3) {
				System.out.println(e);
			}
		};

		List<Employee> employees = EmployeeLocalDB.getAllEmployees();
		employees.forEach(c4);
	}
}
