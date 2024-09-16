package com.xworkz.examples.dataRunner;

import com.xworkz.examples.data.HubliRailwayStation;
import com.xworkz.examples.data.RailwayStationRule;

public class RailwayStationRuleRunner {

	public static void main(String[] args) {
		RailwayStationRule railwayStationRule = new HubliRailwayStation();

		railwayStationRule.haveValidTicket();
		railwayStationRule.followPlatformSigns();
		railwayStationRule.noSmoking();
		railwayStationRule.avoidBlockingEntrances();
		railwayStationRule.maintainCleanliness();
		railwayStationRule.avoidOvercrowding();
		railwayStationRule.useFootbridges();
		railwayStationRule.beOnTime();
		railwayStationRule.avoidLittering();
		railwayStationRule.respectAnnouncements();
		railwayStationRule.keepLuggageSafe();
		railwayStationRule.useDesignatedSeating();
		railwayStationRule.avoidCrossingTracks();
		railwayStationRule.showRespectToRailwayStaff();
		railwayStationRule.followSafetyMeasures();
	}

}
