package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.Bull;
import com.xworkz.inheritance.FarmBull;

public class BullRunner {

	public static void main(String[] args) {

		Bull bull = new Bull();
		bull.breed = "Hereford";
		bull.age = 5;
		bull.weight = 800;
		bull.color = "Brown";
		bull.isTrained = true;

		bull.eat();
		bull.sleep();
		bull.run();
		bull.makeSound();
		
		
		Bull bull1=new FarmBull();
		bull1.displayDetails();

	}

}
