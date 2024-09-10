package com.example.methods.runner;

import com.example.methods.Bedsheet;

public class BedsheetRunner {

	public static void main(String[] args) {
		Bedsheet bedsheet1 = new Bedsheet("king size", "maroon", "cotton");
		Bedsheet bedsheet2 = new Bedsheet("king size", "maroon", "cotton");

		bedsheet1.setCost(1000);
		bedsheet1.setDiscount(10);
		bedsheet1.setShopName("gajanand");

		bedsheet2.setCost(1500);
		bedsheet2.setDiscount(10);
		bedsheet2.setShopName("prem textiles");

		System.out.println(bedsheet1.toString());
		System.out.println(bedsheet1.toString());

		boolean same = bedsheet1.equals(bedsheet2);
		System.out.println("are the bedsheet instances same :" + same);

	}

}
