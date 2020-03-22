package com.java8dev.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImperativeVsDeclarativeProgramming {
	public static void main(String[] args) {
		sumOf100NumbersFrom1To100_ImperavtiveVsDeclarative();
		removeDuplicatesFromList_ImperavtiveVsDeclarative();
	}
	
	private static void sumOf100NumbersFrom1To100_ImperavtiveVsDeclarative() {
		//Imperative
		int sum = 0;
		for(int i=1;i<=100;i++) {
			sum += i;
		}
		System.out.println("Sum using Imperative style : "+sum);
		
		//Declarative
		int sum2 = IntStream.rangeClosed(1, 100).sum();
		System.out.println("Sum using Declarative style : "+sum2);
	}
	
	private static void removeDuplicatesFromList_ImperavtiveVsDeclarative() {
		System.out.println("=================================================");
		List<Integer> integerList = Arrays.asList(1,2,3,3,4,5,6,6,7,7,8,8,9,10);
		System.out.println("The Given List : "+integerList);
		
		//Imperative
		List<Integer> uniqueList = new ArrayList<>();
		for(Integer i : integerList) {
			if(!uniqueList.contains(i)) {
				uniqueList.add(i);
			}
		}
		System.out.println("Unique list using Imperative Style : "+uniqueList);
		
		//Declarative
		List<Integer> uniqueList2 = integerList.stream()
				                               .distinct()
				                               .collect(Collectors.toList());
		System.out.println("Unique list using Declarative Style : "+uniqueList2);
	}
}
