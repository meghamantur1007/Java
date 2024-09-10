package com.example.methods.runner;

import com.example.methods.Helmet;

public class HelmetRunner {

	public static void main(String[] args) {
		Helmet helmet = new Helmet("black", "steelbird", "full face");
		helmet.setMaterial("abs");
		helmet.setPrice(4000);
		helmet.setWeight(1600);

		Helmet helmet1 = new Helmet("black", "apache", "open face");
		helmet1.setMaterial("abs");
		helmet1.setPrice(5000);
		helmet1.setWeight(1600);

		System.out.println(helmet.toString());
		System.out.println(helmet1.toString());

		boolean same = helmet1.equals(helmet);
		System.out.println("are the state instances same :" + same);

	}

}
