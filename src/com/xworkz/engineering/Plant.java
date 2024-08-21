package com.xworkz.engineering;

public class Plant {
	 String name="Rose";
     String type="Flowering";
     double height=0.5;
     double age=2;
     String color="Red";
     boolean isEvergreen;
     String habitat;
     int leavesCount;
     boolean isFlowering;
     double waterRequirement;
    
    public Plant( boolean isEvergreen, String habitat, int leavesCount, boolean isFlowering, double waterRequirement) {
    	this.isEvergreen=isEvergreen;
    	this.habitat=habitat;
    	this.leavesCount=leavesCount;
    	this.isFlowering=isFlowering;
    	this.waterRequirement=waterRequirement;
    	
    }
    public void print() {
    	System.out.println("Plant Name: "+name);
    	System.out.println("Plant Type: "+type);
    	System.out.println("Plant Height: "+height);
    	System.out.println("Plant Age: "+age);
    	System.out.println("Plant Color: "+color);
    	System.out.println("IsEverGreen: "+isEvergreen);
    	System.out.println("Plant Habitat: "+habitat);
    	System.out.println("Plant leavesCount: "+leavesCount);
    	System.out.println("isFlowering: "+isFlowering);
    	System.out.println("Plant waterRequirement: "+waterRequirement);
    	System.out.println("========================");
    }
}
