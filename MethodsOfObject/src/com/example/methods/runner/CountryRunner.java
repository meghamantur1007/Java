package com.example.methods.runner;

import com.example.methods.Country;

public class CountryRunner {

	public static void main(String[] args) {

		Country country = new Country("Asia", "India", "New Delhi");
		Country country1 = new Country("Asia", "India", "New Delhi");

		country.setPm("modi");
		country.setPresident("draupadi murmu");
		country.setStates(28);

		country1.setPm("modi");
		country1.setPresident("draupadi murmu");
		country1.setStates(28);

		System.out.println(country.toString());
		System.out.println(country1.toString());

		boolean same = country.equals(country1);
		System.out.println("are the country instances same :" + same);
	}

}
