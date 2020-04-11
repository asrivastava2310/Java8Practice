package com.java8dev.practice.methodreferences;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

	private static Function<String, String> upperCaseFunction = (s) -> s.toUpperCase();
	private static Function<String, String> upperCaseFunctionMethodReference = String::toUpperCase;

	public static void main(String[] args) {
		System.out.println(upperCaseFunction.apply("Hello There. Howdy?"));
		System.out.println(upperCaseFunctionMethodReference.apply("Hello There. Howdy?"));
	}

}
