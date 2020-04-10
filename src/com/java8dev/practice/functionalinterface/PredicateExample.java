package com.java8dev.practice.functionalinterface;

import java.util.function.Predicate;

public class PredicateExample {
	
    private static  Predicate<Integer> isEven = (num)-> {return num%2 == 0;};
    private static Predicate<Integer> isEven1 = (num)->num%2 == 0;
    private static Predicate<Integer> divBy3 = (num)->num%3 == 0;
    
	public static void main(String[] args) {
         System.out.println(isEven.test(5)); //prints false
         System.out.println(isEven1.test(5)); //prints false
         
         evenAndDivisibleBy3(30);  //should return true
         OddOrDivisibleBy3(18);    //should return true
         
         
	}
	
	private static void evenAndDivisibleBy3(int num) {
		System.out.println(num+" is even and divisble by 3 both? : "+isEven.and(divBy3).test(num));
	}
	
	private static void OddOrDivisibleBy3(int num) {
		System.out.println(num+" either is odd or divisble by 3? : "+isEven.negate().or(divBy3).test(num));
	}

}
