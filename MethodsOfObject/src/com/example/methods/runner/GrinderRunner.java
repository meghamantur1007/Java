package com.example.methods.runner;

import com.example.methods.Grinder;

public class GrinderRunner {

	public static void main(String[] args) {
		Grinder grinder1 = new Grinder("Bosch", 200, "Metal");
		Grinder grinder2 = new Grinder("Bosch", 150, "Metal");

		grinder1.setColor("Black");
		grinder1.setCost(1500);
		grinder1.setType("Electric");

		grinder2.setColor("Silver");
		grinder2.setCost(1500);
		grinder2.setType("Manual");

		System.out.println(grinder1.toString());
		System.out.println(grinder2.toString());

		boolean store = grinder1.equals(grinder2);
		System.out.println("Are the saree instances same:" + store);

	}

}
