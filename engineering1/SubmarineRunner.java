package com.xworkz.engineering1;
import com.xworkz.engineering.Submarine;

public class SubmarineRunner {

	public static void main(String[] args) {
		
		    Submarine submarine = new Submarine("Nautilus", "USA", 134, 300, 97.5);
		    Submarine submarine1 = new Submarine("Poseidon", "Russia", 160, 400, 110.3);
		    Submarine submarine2= new Submarine("Seawolf", "USA", 140, 450, 100.2);

		    
		    submarine.setWeight(18000);
		    submarine.setSpeed(25);
		    submarine.setPropulsionType("Nuclear");
		    submarine.setDisplacement(15000);
		    submarine.setIsNuclearPowered(true);
		    submarine.setPrimaryMission("Attack");
		    submarine.setNumberOfTorpedoes(20);
		    submarine.setNumberOfMissiles(8);
		    submarine.setSonarSystem("Active Sonar");
		    submarine.setHasStealthCapabilities(true);
		    submarine.setNumberOfPeriscopes(2);
		    submarine.setIsSubmerged(true);
		    submarine.setNumberOfDecks(5);
		    submarine.setHullThickness(0.05);
		    submarine.setLaunchDate("2024-08-01");
		    submarine.setManufacturer("General Dynamics");
		    submarine.setCurrentStatus("Active");
		    submarine.setHasEscapePod(true);
		    submarine.setHasRescueChamber(true);
		    submarine.setOxygenSupply(72);
		    submarine.setFuelCapacity(100000);
		    submarine.setHasSatelliteCommunication(true);
		    submarine.setHasAutomatedNavigation(true);
		    submarine.setNumberOfTorpedoTubes(6);
		    submarine.setNumberOfBallastTanks(10);
		    submarine.setDiveTime(30);
		    submarine.setCommandSystem("Digital Command System");
		    submarine.setHasAntiRadarCoating(true);
		    submarine.setCombatSystem("Integrated Combat System");
		    submarine.setElectronicWarfareSystem("EW Suite");
		    submarine.setRadarSystem("Surface Radar");
		    submarine.setHasLifeSupportSystem(true);
		    submarine.setMainBatteryType("Lithium-ion");
		    submarine.setEndurance(90);
		    submarine.setHasCountermeasureSystem(true);
		    
		    
		    submarine1.setWeight(20000);
		    submarine1.setSpeed(30);
		    submarine1.setPropulsionType("Nuclear");
		    submarine1.setDisplacement(18000);
		    submarine1.setIsNuclearPowered(true);
		    submarine1.setPrimaryMission("Ballistic Missile");
		    submarine1.setNumberOfTorpedoes(25);
		    submarine1.setNumberOfMissiles(12);
		    submarine1.setSonarSystem("Passive Sonar");
		    submarine1.setHasStealthCapabilities(true);
		    submarine1.setNumberOfPeriscopes(3);
		    submarine1.setIsSubmerged(true);
		    submarine1.setNumberOfDecks(6);
		    submarine1.setHullThickness(0.06);
		    submarine1.setLaunchDate("2023-05-15");
		    submarine1.setManufacturer("Rubin Design Bureau");
		    submarine1.setCurrentStatus("Active");
		    submarine1.setHasEscapePod(true);
		    submarine1.setHasRescueChamber(true);
		    submarine1.setOxygenSupply(80);
		    submarine1.setFuelCapacity(120000);
		    submarine1.setHasSatelliteCommunication(true);
		    submarine1.setHasAutomatedNavigation(true);
		    submarine1.setNumberOfTorpedoTubes(8);
		    submarine1.setNumberOfBallastTanks(12);
		    submarine1.setDiveTime(35);
		    submarine1.setCommandSystem("Advanced Command System");
		    submarine1.setHasAntiRadarCoating(true);
		    submarine1.setCombatSystem("Next-Gen Combat System");
		    submarine1.setElectronicWarfareSystem("Electronic Warfare Suite");
		    submarine1.setRadarSystem("Advanced Surface Radar");
		    submarine1.setHasLifeSupportSystem(true);
		    submarine1.setMainBatteryType("Lithium-polymer");
		    submarine1.setEndurance(120);
		    submarine1.setHasCountermeasureSystem(true);
		    
		    
		    submarine2.setWeight(19000);
		    submarine2.setSpeed(28);
		    submarine2.setPropulsionType("Nuclear");
		    submarine2.setDisplacement(16000);
		    submarine2.setIsNuclearPowered(true);
		    submarine2.setPrimaryMission("Stealth Operations");
		    submarine2.setNumberOfTorpedoes(30);
		    submarine2.setNumberOfMissiles(10);
		    submarine2.setSonarSystem("Dual Sonar System");
		    submarine2.setHasStealthCapabilities(true);
		    submarine2.setNumberOfPeriscopes(2);
		    submarine2.setIsSubmerged(true);
		    submarine2.setNumberOfDecks(5);
		    submarine2.setHullThickness(0.055);
		    submarine2.setLaunchDate("2025-03-20");
		    submarine2.setManufacturer("Electric Boat");
		    submarine2.setCurrentStatus("Under Construction");
		    submarine2.setHasEscapePod(true);
		    submarine2.setHasRescueChamber(true);
		    submarine2.setOxygenSupply(75);
		    submarine2.setFuelCapacity(115000);
		    submarine2.setHasSatelliteCommunication(true);
		    submarine2.setHasAutomatedNavigation(true);
		    submarine2.setNumberOfTorpedoTubes(7);
		    submarine2.setNumberOfBallastTanks(11);
		    submarine2.setDiveTime(32);
		    submarine2.setCommandSystem("Stealth Command System");
		    submarine2.setHasAntiRadarCoating(true);
		    submarine2.setCombatSystem("Stealth Combat System");
		    submarine2.setElectronicWarfareSystem("Advanced EW Suite");
		    submarine2.setRadarSystem("Stealth Surface Radar");
		    submarine2.setHasLifeSupportSystem(true);
		    submarine2.setMainBatteryType("High-Energy Battery");
		    submarine2.setEndurance(100);
		    submarine2.setHasCountermeasureSystem(true);
		  

		    
		    Submarine[] ref=new Submarine[3];
		    
		    ref[0]=submarine;
		    ref[1]=submarine1;
		    ref[2]=submarine2;
		    
		    for(Submarine values:ref) {
		    	values.printSubmarineDetails();
		    }
		    
		    
		}


	}


