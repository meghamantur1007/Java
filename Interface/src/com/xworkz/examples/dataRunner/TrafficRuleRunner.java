package com.xworkz.examples.dataRunner;

import com.xworkz.examples.data.BangaloreCity;
import com.xworkz.examples.data.TrafficRule;

public class TrafficRuleRunner {

	public static void main(String[] args) {
		TrafficRule trafficRule=new BangaloreCity();
		trafficRule.followSpeedLimit();
		trafficRule.wearSeatbelt();
		trafficRule.followTrafficLights();
		trafficRule.avoidDrunkDriving();
		trafficRule.useIndicators();
		trafficRule.stopForPedestrians();
		trafficRule.obeyTrafficSigns();
		trafficRule.noOverloading();
		trafficRule.followLaneDiscipline();
		trafficRule.avoidDrunkDriving();
		trafficRule.followHelmetRule();
		trafficRule.keepSafeDistance();
		trafficRule.properParking();
		trafficRule.noHonkingInSilentZones();
		trafficRule.ensureVehicleInsurance();
	}

}
