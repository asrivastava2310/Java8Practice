package com.java8dev.practice.functionalinterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	private static Comparator<Integer> integerComparator = (x,y)->x.compareTo(y);
	
	public static void main(String[] args) {
		
        BinaryOperator<Integer> multiply = (a,b)-> a*b;
        System.out.println(multiply.apply(5, 7));//prints 35
        
        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(integerComparator);
        System.out.println(maxBy.apply(5, 7)); //prints 7
        
        BinaryOperator<Integer> minBy = BinaryOperator.minBy(integerComparator);
        System.out.println(minBy.apply(5, 7)); //prints 6
	}

}
