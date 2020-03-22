package com.java8dev.lamdas.practice;

import java.util.Comparator;

public class ComparatorUsingLambda {

	public static void main(String[] args) {
		// Legacy Way
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// returns 0 if o1==o2
				// returns 1(positive) if o1>o2
				// returns -1(negative) if o1<2
				return o1.compareTo(o2);
			}
		};
		System.out.println("Comparator result using Legacy Way : " + comparator.compare(3, 2));

		// Lambda Way
		Comparator<Integer> comparator2 = (o1, o2) -> o1.compareTo(o2);
		System.out.println("Comparator result using Lambda Way : " + comparator2.compare(3, 2));
	}

}
