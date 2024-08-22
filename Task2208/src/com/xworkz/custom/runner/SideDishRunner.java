package com.xworkz.custom.runner;

import com.xworkz.custom.data.SideDish;
import com.xworkz.custom.store.SideDishDataStore;

public class SideDishRunner {

	public static void main(String[] args) {
		SideDishDataStore data=new SideDishDataStore();
		
		SideDish sideDish=new SideDish("Masala Papad", 50, "Vegetarian");
		SideDish sideDish1=new SideDish("Chicken Wings", 150, "Non-Vegetarian");
		SideDish sideDish2=new SideDish("Paneer Tikka", 120, "Vegetarian");
		SideDish sideDish3=new SideDish("Fish Fry", 200, "Non-Vegetarian");
		SideDish sideDish4=new SideDish("French Fries", 80, "Vegetarian");
		data.store(sideDish);
		data.store(sideDish1);
		data.store(sideDish2);
		data.store(sideDish3);
		data.store(sideDish4);
		data.show();
	}

}
