package com.xworkz.runner;

import com.xworkz.implement.CanaraHotelRuleImplement;
import com.xworkz.interfaces.HotelRule;
import com.xworkz.use.FoodSafteyDepartment;

public class HotelRuleRunner {

	public static void main(String[] args) {
		HotelRule hotelRule = new CanaraHotelRuleImplement();
		FoodSafteyDepartment foodSafteyDepartment = new FoodSafteyDepartment();
		foodSafteyDepartment.setHotelRule(hotelRule);
		foodSafteyDepartment.inspection();
	}

}
