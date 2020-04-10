package com.java8dev.practice.functionalinterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.java8dev.practice.utils.Employee;
import com.java8dev.practice.utils.EmployeeLocalDB;

public class PredicateAndConsumerExample {

	private Predicate<Employee> highestRated = (e)->e.getRating() == 3;
	private Predicate<Employee> awsEnabled = (e)->e.getCertificates().contains("AWS");
	private BiConsumer<String, List<String>> employeeBiConsumer = (name,certificates)->System.out.println(name+" "+certificates);
	private Consumer<Employee> employeeConsumer = (employee)->{
		if(highestRated.and(awsEnabled).test(employee)) {
			employeeBiConsumer.accept(employee.getName(), employee.getCertificates());
		};
	};
	
	public static void main(String[] args) {
        List<Employee> employees = EmployeeLocalDB.getAllEmployees();
        new PredicateAndConsumerExample().printNameAndCertifications(employees);
	}
	
	public void printNameAndCertifications(List<Employee> employees) {
		employees.forEach(employeeConsumer);
	}
}
