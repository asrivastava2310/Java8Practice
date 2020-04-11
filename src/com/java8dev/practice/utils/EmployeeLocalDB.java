package com.java8dev.practice.utils;

import java.util.Arrays;
import java.util.List;

import javax.swing.plaf.BorderUIResource.EmptyBorderUIResource;

public class EmployeeLocalDB {
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
