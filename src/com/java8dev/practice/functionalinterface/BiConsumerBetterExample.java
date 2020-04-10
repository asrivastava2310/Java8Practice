package com.java8dev.practice.functionalinterface;

import java.util.List;
import java.util.function.BiConsumer;
import com.java8dev.practice.utils.Employee;
import com.java8dev.practice.utils.EmployeeLocalDB;


public class BiConsumerBetterExample {

	public static void main(String[] args) {
		namesAndCertificates();
	}

	private static void namesAndCertificates() {
		BiConsumer<String, List<String>> namesAndCertificates = (names, certificates)-> {
			     System.out.println(names+" "+certificates);          
		};
		List<Employee> employees = EmployeeLocalDB.getAllEmployees();
		employees.forEach(employee -> namesAndCertificates.accept(employee.getName(), employee.getCertificates()));
	}
}
