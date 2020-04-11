package com.java8dev.practice.functionalinterface;

import java.util.function.UnaryOperator;

public class UnaryOpearatorExample {

	//Input and output are of the same type
	private static UnaryOperator<String> unaryOperator = (s) -> s.concat("Yeah May be!");

	public static void main(String[] args) {
		System.out.println(unaryOperator.apply("Weather is plesant here. "));
	}
}
