package com.java8dev.practice.functionalinterface;

import java.util.List;
import java.util.function.Supplier;

import com.java8dev.practice.utils.Employee;
import com.java8dev.practice.utils.EmployeeLocalDB;

public class SupplierExample {

	public static void main(String[] args) {
        Supplier<List<Employee>> employeesSupplier = ()->EmployeeLocalDB.getAllEmployees();
        System.out.println(employeesSupplier.get());
	}

}
