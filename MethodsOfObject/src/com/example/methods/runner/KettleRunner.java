package com.example.methods.runner;

import com.example.methods.Kettle;

public class KettleRunner {

	public static void main(String[] args) {
		Kettle kettle1 = new Kettle("Philips", 1.5, "Stainless Steel");
		Kettle kettle2 = new Kettle("Bosch", 1.5, "Stainless Steel");

		kettle1.setColor("Silver");
		kettle1.setPowerRating(1500);
		kettle1.setType("Electric");

		kettle2.setColor("Black");
		kettle2.setPowerRating(1600);
		kettle2.setType("Electric");

		kettle1.toString();
		kettle2.toString();

		System.out.println(kettle1.toString());
		System.out.println(kettle2.toString());

		boolean store = kettle1.equals(kettle2);
		System.out.println("Are the saree instances same:" + store);
	}

}
