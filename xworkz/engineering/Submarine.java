package com.xworkz.engineering;

	public class Submarine {

	   
	     String name;
	     String countryOfOrigin;
	     int crewCapacity;
	     double maxDepth; 
	     double length; 
	     double weight; 
	     double speed; 
	     String propulsionType;
	     double displacement;
	     boolean isNuclearPowered;
	     String primaryMission;
	     int numberOfTorpedoes;
	     int numberOfMissiles;
	     String sonarSystem;
	     boolean hasStealthCapabilities;
	     int numberOfPeriscopes;
	     boolean isSubmerged;
	     int numberOfDecks;
	     double hullThickness; 
	     String launchDate;
	     String manufacturer;
	     String currentStatus;
	     boolean hasEscapePod;
	     boolean hasRescueChamber;
	     double oxygenSupply; 
	     double fuelCapacity; 
	     boolean hasSatelliteCommunication;
	     boolean hasAutomatedNavigation;
	     int numberOfTorpedoTubes;
	     int numberOfBallastTanks;
	     double diveTime; 
	     String commandSystem;
	     boolean hasAntiRadarCoating;
	     String combatSystem;
	     String electronicWarfareSystem;
	     String radarSystem;
	     boolean hasLifeSupportSystem;
	     String mainBatteryType;
	     double endurance; 
	     boolean hasCountermeasureSystem;

	   
	    public Submarine(String name, String countryOfOrigin, int crewCapacity, double maxDepth, double length) {
	        this.name = name;
	        this.countryOfOrigin = countryOfOrigin;
	        this.crewCapacity = crewCapacity;
	        this.maxDepth = maxDepth;
	        this.length = length;
	        
	    }

	    
	    public void setWeight(double weight) {
	        this.weight = weight;
	    }

	    public void setSpeed(double speed) {
	        this.speed = speed;
	    }

	    public void setPropulsionType(String propulsionType) {
	        this.propulsionType = propulsionType;
	    }

	    public void setDisplacement(double displacement) {
	        this.displacement = displacement;
	    }

	    public void setIsNuclearPowered(boolean isNuclearPowered) {
	        this.isNuclearPowered = isNuclearPowered;
	    }

	    public void setPrimaryMission(String primaryMission) {
	        this.primaryMission = primaryMission;
	    }

	    public void setNumberOfTorpedoes(int numberOfTorpedoes) {
	        this.numberOfTorpedoes = numberOfTorpedoes;
	    }

	    public void setNumberOfMissiles(int numberOfMissiles) {
	        this.numberOfMissiles = numberOfMissiles;
	    }

	    public void setSonarSystem(String sonarSystem) {
	        this.sonarSystem = sonarSystem;
	    }

	    public void setHasStealthCapabilities(boolean hasStealthCapabilities) {
	        this.hasStealthCapabilities = hasStealthCapabilities;
	    }

	    public void setNumberOfPeriscopes(int numberOfPeriscopes) {
	        this.numberOfPeriscopes = numberOfPeriscopes;
	    }

	    public void setIsSubmerged(boolean isSubmerged) {
	        this.isSubmerged = isSubmerged;
	    }

	    public void setNumberOfDecks(int numberOfDecks) {
	        this.numberOfDecks = numberOfDecks;
	    }

	    public void setHullThickness(double hullThickness) {
	        this.hullThickness = hullThickness;
	    }

	    public void setLaunchDate(String launchDate) {
	        this.launchDate = launchDate;
	    }

	    public void setManufacturer(String manufacturer) {
	        this.manufacturer = manufacturer;
	    }

	    public void setCurrentStatus(String currentStatus) {
	        this.currentStatus = currentStatus;
	    }

	    public void setHasEscapePod(boolean hasEscapePod) {
	        this.hasEscapePod = hasEscapePod;
	    }

	    public void setHasRescueChamber(boolean hasRescueChamber) {
	        this.hasRescueChamber = hasRescueChamber;
	    }

	    public void setOxygenSupply(double oxygenSupply) {
	        this.oxygenSupply = oxygenSupply;
	    }

	    public void setFuelCapacity(double fuelCapacity) {
	        this.fuelCapacity = fuelCapacity;
	    }

	    public void setHasSatelliteCommunication(boolean hasSatelliteCommunication) {
	        this.hasSatelliteCommunication = hasSatelliteCommunication;
	    }

	    public void setHasAutomatedNavigation(boolean hasAutomatedNavigation) {
	        this.hasAutomatedNavigation = hasAutomatedNavigation;
	    }

	    public void setNumberOfTorpedoTubes(int numberOfTorpedoTubes) {
	        this.numberOfTorpedoTubes = numberOfTorpedoTubes;
	    }

	    public void setNumberOfBallastTanks(int numberOfBallastTanks) {
	        this.numberOfBallastTanks = numberOfBallastTanks;
	    }

	    public void setDiveTime(double diveTime) {
	        this.diveTime = diveTime;
	    }

	    public void setCommandSystem(String commandSystem) {
	        this.commandSystem = commandSystem;
	    }

	    public void setHasAntiRadarCoating(boolean hasAntiRadarCoating) {
	        this.hasAntiRadarCoating = hasAntiRadarCoating;
	    }

	    public void setCombatSystem(String combatSystem) {
	        this.combatSystem = combatSystem;
	    }

	    public void setElectronicWarfareSystem(String electronicWarfareSystem) {
	        this.electronicWarfareSystem = electronicWarfareSystem;
	    }

	    public void setRadarSystem(String radarSystem) {
	        this.radarSystem = radarSystem;
	    }

	    public void setHasLifeSupportSystem(boolean hasLifeSupportSystem) {
	        this.hasLifeSupportSystem = hasLifeSupportSystem;
	    }

	    public void setMainBatteryType(String mainBatteryType) {
	        this.mainBatteryType = mainBatteryType;
	    }

	    public void setEndurance(double endurance) {
	        this.endurance = endurance;
	    }

	    public void setHasCountermeasureSystem(boolean hasCountermeasureSystem) {
	        this.hasCountermeasureSystem = hasCountermeasureSystem;
	    }

	    
	    public void printSubmarineDetails() {
	        System.out.println("Submarine Details:");
	        System.out.println("Name: " + name);
	        System.out.println("Country of Origin: " + countryOfOrigin);
	        System.out.println("Crew Capacity: " + crewCapacity);
	        System.out.println("Max Depth: " + maxDepth + " meters");
	        System.out.println("Length: " + length + " meters");
	        System.out.println("Weight: " + weight + " tons");
	        System.out.println("Speed: " + speed + " knots");
	        System.out.println("Propulsion Type: " + propulsionType);
	        System.out.println("Displacement: " + displacement + " tons");
	        System.out.println("Is Nuclear Powered: " + isNuclearPowered);
	        System.out.println("Primary Mission: " + primaryMission);
	        System.out.println("Number of Torpedoes: " + numberOfTorpedoes);
	        System.out.println("Number of Missiles: " + numberOfMissiles);
	        System.out.println("Sonar System: " + sonarSystem);
	        System.out.println("Has Stealth Capabilities: " + hasStealthCapabilities);
	        System.out.println("Number of Periscopes: " + numberOfPeriscopes);
	        System.out.println("Is Submerged: " + isSubmerged);
	        System.out.println("Number of Decks: " + numberOfDecks);
	        System.out.println("Hull Thickness: " + hullThickness + " meters");
	        System.out.println("Launch Date: " + launchDate);
	        System.out.println("Manufacturer: " + manufacturer);
	        System.out.println("Current Status: " + currentStatus);
	        System.out.println("Has Escape Pod: " + hasEscapePod);
	        System.out.println("Has Rescue Chamber: " + hasRescueChamber);
	        System.out.println("Oxygen Supply: " + oxygenSupply + " hours");
	        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
	        System.out.println("Has Satellite Communication: " + hasSatelliteCommunication);
	        System.out.println("Has Automated Navigation: " + hasAutomatedNavigation);
	        System.out.println("Number of Torpedo Tubes: " + numberOfTorpedoTubes);
	        System.out.println("Number of Ballast Tanks: " + numberOfBallastTanks);
	        System.out.println("Dive Time: " + diveTime + " minutes");
	        System.out.println("Command System: " + commandSystem);
	        System.out.println("Has Anti-Radar Coating: " + hasAntiRadarCoating);
	        System.out.println("Combat System: " + combatSystem);
	        System.out.println("Electronic Warfare System: " + electronicWarfareSystem);
	        System.out.println("Radar System: " + radarSystem);
	        System.out.println("Has Life Support System: " + hasLifeSupportSystem);
	        System.out.println("Main Battery Type: " + mainBatteryType);
	        System.out.println("Endurance: " + endurance + " days");
	        System.out.println("Has Countermeasure System: " + hasCountermeasureSystem);
	        System.out.println("=============================================================");
	    }
	}


