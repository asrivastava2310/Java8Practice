package com.java8dev.practice.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

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

class Employee {
	private String name;
	private int rating;
	private String geneder;
	private List<String> certificates;

	public Employee(String name, int rating, String geneder, List<String> certificates) {
		this.name = name;
		this.rating = rating;
		this.geneder = geneder;
		this.certificates = certificates;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getGeneder() {
		return geneder;
	}

	public void setGeneder(String geneder) {
		this.geneder = geneder;
	}

	public List<String> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<String> certificates) {
		this.certificates = certificates;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [name=");
		builder.append(name);
		builder.append(", rating=");
		builder.append(rating);
		builder.append(", geneder=");
		builder.append(geneder);
		builder.append(", certificates=");
		builder.append(certificates);
		builder.append("]");
		return builder.toString();
	}
}

class EmployeeLocalDB {
	public static List<Employee> getAllEmployees() {
		// Rating 1 Employees
		Employee e1 = new Employee("John", 1, "Male", Arrays.asList("Java", "AWS", "GCP"));
		Employee e2 = new Employee("Dazy", 1, "Female", Arrays.asList("Java", "GCP"));

		// Rating 2 Employees
		Employee e3 = new Employee("Rambo", 2, "Male", Arrays.asList("Docker", "GCP"));
		Employee e4 = new Employee("Suzan", 2, "Female", Arrays.asList("Docker", "Kubernetes"));

		// Rating 3 Employees
		Employee e5 = new Employee("David", 3, "Male", Arrays.asList("Java", "AWS", "GCP", "Kubernetes", "Docker"));
		Employee e6 = new Employee("Mike", 3, "Male", Arrays.asList("Java Security", "Kubernetes"));

		return Arrays.asList(e1, e2, e3, e4, e5, e6);
	}
}
