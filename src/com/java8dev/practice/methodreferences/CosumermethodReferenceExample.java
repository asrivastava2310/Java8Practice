package com.java8dev.practice.methodreferences;

import java.util.function.Consumer;

import com.java8dev.practice.utils.Employee;
import com.java8dev.practice.utils.EmployeeLocalDB;

public class CosumermethodReferenceExample {

	private static Consumer<Employee> employeeConsumer = System.out::println;

	private static Consumer<Employee> employeeCertificatesConsumer = Employee::printCertificates;

	public static void main(String[] args) {
		EmployeeLocalDB.getAllEmployees().forEach(employeeConsumer);
		EmployeeLocalDB.getAllEmployees().forEach(employeeCertificatesConsumer);
	}

}
