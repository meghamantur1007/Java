package com.example.methods.runner;

import com.example.methods.Bulb;

public class BulbRunner {

	public static void main(String[] args) {
		Bulb bulb = new Bulb("philips", 200, 20);
		Bulb bulb1 = new Bulb("Crompton", 570, 12);

		bulb.setColor("white");
		bulb.setCost(400);
		bulb.setWarranty(1);

		bulb1.setColor("white");
		bulb1.setCost(400);
		bulb1.setWarranty(1);

		System.out.println(bulb.toString());
		System.out.println(bulb1.toString());

		boolean same = bulb.equals(bulb1);
		System.out.println("are the bulb instances same :" + same);
	}

}
