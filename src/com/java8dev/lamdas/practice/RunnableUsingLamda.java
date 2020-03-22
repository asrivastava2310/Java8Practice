package com.java8dev.lamdas.practice;

public class RunnableUsingLamda {

	public static void main(String[] args) {

		// Legacy Way
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside Runnable Legacy Way");
			}
		};
		Thread thread1 = new Thread(runnable);
		thread1.start();

		// Lambda Way
		Runnable runnable2 = () -> {
			System.out.println("Inside Runnable Lambda Way");
		};
		Thread thread2 = new Thread(runnable2);
		thread2.start();

	}

}
