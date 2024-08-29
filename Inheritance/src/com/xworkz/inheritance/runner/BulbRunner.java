package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.Bulb;
import com.xworkz.inheritance.LED;

public class BulbRunner {

	public static void main(String[] args) {
		
		Bulb bulb=new Bulb();
		bulb.volts=40;
		
		Bulb bulb1=new LED();
		bulb1.volts=60;
		
		bulb.glow();
		bulb1.glow();
	}

}
