package com.java8dev.practice.functionalinterface;

import java.util.function.Function;

public class FunctionExample {

	private static Function<String, String> upperCaseFunction = (name) -> name.toUpperCase();
	private static Function<String, String> concatFunction = (name) -> name.concat("Yeah May be!") ;

	public static void main(String[] args) {
		System.out.println(upperCaseFunction.apply("This is New York!"));
		System.out.println(upperCaseFunction.andThen(concatFunction).apply("This is New York!"));
		System.out.println(upperCaseFunction.compose(concatFunction).apply("This is New York!"));
		
		//Output:
		//THIS IS NEW YORK!
		//THIS IS NEW YORK!Yeah May be!
		//THIS IS NEW YORK!YEAH MAY BE!
	}
}
