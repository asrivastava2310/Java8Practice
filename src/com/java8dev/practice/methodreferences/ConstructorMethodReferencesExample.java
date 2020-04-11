package com.java8dev.practice.methodreferences;

import java.util.function.Function;
import java.util.function.Supplier;

import com.java8dev.practice.utils.Employee;

public class ConstructorMethodReferencesExample {

	private static Supplier<Employee> employeeSupplier = Employee::new;// no-arg constructor must be present

	private static Function<String, Employee> employeeWithOnlyName = Employee::new;

	public static void main(String[] args) {
		System.out.println(employeeSupplier.get());
		System.out.println(employeeWithOnlyName.apply("Robert Frost"));
	}
}