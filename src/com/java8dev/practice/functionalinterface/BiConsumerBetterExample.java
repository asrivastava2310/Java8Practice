package com.java8dev.practice.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;


public class BiConsumerBetterExample {

	public static void main(String[] args) {
		namesAndCertificates();
	}

	private static void namesAndCertificates() {
		BiConsumer<String, List<String>> namesAndCertificates = (names, certificates)-> {
			     System.out.println(names+" "+certificates);          
		};
		List<Employee1> employees = EmployeeLocalDB1.getAllEmployees();
		employees.forEach(employee -> namesAndCertificates.accept(employee.getName(), employee.getCertificates()));
	}
}
class Employee1{
	private String name;
	private int rating;
	private String geneder;
	private List<String> certificates;

	public Employee1(String name, int rating, String geneder, List<String> certificates) {
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

class EmployeeLocalDB1 {
	public static List<Employee1> getAllEmployees() {
		// Rating 1 Employees
		Employee1 e1 = new Employee1("John", 1, "Male", Arrays.asList("Java", "AWS", "GCP"));
		Employee1 e2 = new Employee1("Dazy", 1, "Female", Arrays.asList("Java", "GCP"));

		// Rating 2 Employees
		Employee1 e3 = new Employee1("Rambo", 2, "Male", Arrays.asList("Docker", "GCP"));
		Employee1 e4 = new Employee1("Suzan", 2, "Female", Arrays.asList("Docker", "Kubernetes"));

		// Rating 3 Employees
		Employee1 e5 = new Employee1("David", 3, "Male", Arrays.asList("Java", "AWS", "GCP", "Kubernetes", "Docker"));
		Employee1 e6 = new Employee1("Mike", 3, "Male", Arrays.asList("Java Security", "Kubernetes"));

		return Arrays.asList(e1, e2, e3, e4, e5, e6);
	}
}

