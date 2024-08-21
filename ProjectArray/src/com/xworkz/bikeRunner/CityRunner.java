package com.xworkz.bikeRunner;

import com.xworkx.bike.City;

public class CityRunner {

	public static void main(String[] args) {
		City city=new City();
		
		city.store("Bangalore");
		city.store("Pune");
		city.store("Mumbai");
		city.store("Panaji");
		city.store("Mangalore");
		city.store("Belagaum");
		city.store("Tumkur");
		
		
		city.display();


	}

}
