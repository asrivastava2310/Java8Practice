package com.java8dev.practice.utils;

import java.util.List;

public class Employee {
	private String name;
	private int rating;
	private String geneder;
	private List<String> certificates;

	public Employee(String name, int rating, String geneder, List<String> certificates) {
		this.name = name;
		this.rating = rating;
		this.geneder = geneder;
		this.certificates = certificates;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getGeneder() {
		return geneder;
	}

	public void setGeneder(String geneder) {
		this.geneder = geneder;
	}

	public List<String> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<String> certificates) {
		this.certificates = certificates;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [name=");
		builder.append(name);
		builder.append(", rating=");
		builder.append(rating);
		builder.append(", geneder=");
		builder.append(geneder);
		builder.append(", certificates=");
		builder.append(certificates);
		builder.append("]");
		return builder.toString();
	}
}
