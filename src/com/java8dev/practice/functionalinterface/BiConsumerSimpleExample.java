package com.java8dev.practice.functionalinterface;

import java.util.function.BiConsumer;


public class BiConsumerSimpleExample {

	public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a,b)->{System.out.println("a : "+a+" , b : "+b);};
        biConsumer.accept("Hello", "World!");
        
        //output : a : Hello , b : World!
        
        BiConsumer<Integer, Integer> add = (a,b)->{System.out.println("Addition of "+a+" and "+b+" is "+(a+b));};
        add.accept(5, 6);
        //Output : Addition of 5 and 6 is 11
        
        BiConsumer<Integer, Integer> multiply = (a,b)->{System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b));};
        multiply.accept(5, 6);
        //Output : Multiplication of 5 and 6 is 30
        
        //BiConsumer Chaining
        add.andThen(multiply).accept(9,8);
        //Output
        //Addition of 9 and 8 is 17
        //Multiplication of 9 and 8 is 72
	}
}
