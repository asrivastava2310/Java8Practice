package com.java8dev.practice.functionalinterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.java8dev.practice.utils.Employee;
import com.java8dev.practice.utils.EmployeeLocalDB;

public class FunctionRealWorldExample {

	private static Function<List<Employee>, Map<String,Integer>> employeeRatings = (employees)->{
		Map<String,Integer> ratings = new HashMap<>();
		employees.forEach(
				(e)->{
					ratings.put(e.getName(), e.getRating());
				}
         );
		return ratings;
	};	
	public static void main(String[] args) {
       System.out.println(employeeRatings.apply(EmployeeLocalDB.getAllEmployees()));
	}

}
