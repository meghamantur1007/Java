package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.Chicken;
import com.xworkz.inheritance.FarmChicken;

public class ChickenRunner {

	public static void main(String[] args) {
		
		Chicken chicken=new Chicken();
		chicken.breed="Leghorn";
		chicken.age=3;
		chicken.weight=2.5;
	    chicken.color="White";
	    chicken.isFreeRange=true;
	    chicken.eggProductionPerWeek=5;
	    chicken.featherType="Smooth";
	    chicken.hasComb=true;
	    chicken.isVaccinated=true;
	    chicken.dailyFeedAmount=0.1;
		
	    chicken.layEgg();
	    chicken.eat();
	    chicken.sleep();
	    chicken.scratchGround();
	    
	    
	    Chicken chicken1=new FarmChicken();
	    chicken1.displayDetails();
	    
	}

}
