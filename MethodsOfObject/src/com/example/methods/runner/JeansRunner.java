package com.example.methods.runner;

import com.example.methods.Jeans;

public class JeansRunner {

	public static void main(String[] args) {
		Jeans jeans1 = new Jeans("Levi's", 32, "Blue");
		Jeans jeans2 = new Jeans("Levi's", 32, "Blue");

		jeans1.setFitType("Slim");
		jeans1.setPrice(59.99);
		jeans1.setMaterial("Denim");

		jeans2.setFitType("Regular");
		jeans2.setPrice(65.99);
		jeans2.setMaterial("Denim");

		System.out.println(jeans1.toString());
		System.out.println(jeans2.toString());

		boolean store = jeans1.equals(jeans2);
		System.out.println("Are the jeans instances same:" + store);
	}

}
