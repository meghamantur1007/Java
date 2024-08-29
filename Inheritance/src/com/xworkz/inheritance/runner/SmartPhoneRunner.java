package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.AdvancedSmartPhone;
import com.xworkz.inheritance.SmartPhone;

public class SmartPhoneRunner {

	public static void main(String[] args) {
		
		SmartPhone smartPhone=new SmartPhone();
		smartPhone.brand="Apple";
		smartPhone.model="iPhone 13";
		smartPhone.batteryCapacity=3095;
		smartPhone.storage=128;
		
		
		SmartPhone advancedSmartPhone=new AdvancedSmartPhone();

		smartPhone.displayDetails();
		smartPhone.chargePhone();
		

	}

}
