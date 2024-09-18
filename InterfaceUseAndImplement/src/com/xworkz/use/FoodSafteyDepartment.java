package com.xworkz.use;

import com.xworkz.interfaces.HotelRule;

public class FoodSafteyDepartment {
	private HotelRule hotelRule;

	public void setHotelRule(HotelRule hotelRule) {
		this.hotelRule = hotelRule;
	}

	public void inspection() {
			if (hotelRule != null) {
				System.out.println("hotelRule is not null");
				hotelRule.cleanPremises();
			} else {
				System.out.println("hotelRule is  null");

			}
		}
}
