package com.java8dev.practice.functionalinterface;

import java.util.List;
import java.util.function.Predicate;

import com.java8dev.practice.utils.Employee;
import com.java8dev.practice.utils.EmployeeLocalDB;

public class PredicateRealWorldExample {
	
	private static Predicate<Employee> highestRated = e -> e.getRating() == 3;
	private static Predicate<Employee> awsEnabled = e -> e.getCertificates().contains("AWS");
    
	public static void main(String[] args) {
		List<Employee> employees = EmployeeLocalDB.getAllEmployees();
		
		System.out.println("Highest rated employees");
		System.out.println("================================================>");
        printHihestRatedEmployees(employees);       
        
        System.out.println("================================================>");
        System.out.println("Highest rated employees having AWS Certification");
        printHihestRatedAndAWSEnabledEmployees(employees);
	}

	private static void printHihestRatedEmployees(List<Employee> employees) {
      employees.forEach((e)->{
		    	                  if(highestRated.test(e)) {
		    	                	  System.out.println(e);
		    	                  }
		                        });		
	}
	
	private static void printHihestRatedAndAWSEnabledEmployees(List<Employee> employees) {
	      employees.forEach((e)->{
		    	                  if(highestRated.and(awsEnabled).test(e)) {
		    	                	  System.out.println(e);
		    	                  }
		                        });		
		}

}
