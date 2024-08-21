package com.xworkz.engineering;

public class Ball {
	private String color;
    private String material;
    private double diameter; 
    private double weight; 
    private boolean isInflatable;
    private String brand;
    private String type;
    private String sport; 
    private double bounceHeight;
    private double circumference; 
    private boolean hasGrip;
    private int pressure; 
    private boolean isWaterResistant;
    private String pattern;
    private boolean isUsed;
    private double maxLoad; 
    private String manufactureDate;
    private String originCountry;
    private boolean isRecyclable;
    private double hardness; 
    private boolean isShiny;
    private boolean hasLogo;
    private int warrantyPeriod; 
    private boolean isCustomizable;
    private String customDesign;

    
    public Ball(String color, String material, double diameter, double weight, boolean isInflatable, String brand, String type, String sport) {
        this.color = color;
        this.material = material;
        this.diameter = diameter;
        this.weight = weight;
        this.isInflatable = isInflatable;
        this.brand = brand;
        this.type = type;
        this.sport = sport;
    }

        public void setBounceHeight(double bounceHeight) {
        this.bounceHeight = bounceHeight;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public void setHasGrip(boolean hasGrip) {
        this.hasGrip = hasGrip;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setIsWaterResistant(boolean isWaterResistant) {
        this.isWaterResistant = isWaterResistant;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public void setIsUsed(boolean isUsed) {
        this.isUsed = isUsed;
    }

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public void setIsRecyclable(boolean isRecyclable) {
        this.isRecyclable = isRecyclable;
    }

    public void setHardness(double hardness) {
        this.hardness = hardness;
    }

    public void setIsShiny(boolean isShiny) {
        this.isShiny = isShiny;
    }

    public void setHasLogo(boolean hasLogo) {
        this.hasLogo = hasLogo;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public void setIsCustomizable(boolean isCustomizable) {
        this.isCustomizable = isCustomizable;
    }

    public void setCustomDesign(String customDesign) {
        this.customDesign = customDesign;
    }

    
    public void printBallDetails() {
        System.out.println("Ball Details:");
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Diameter: " + diameter + " cm");
        System.out.println("Weight: " + weight + " g");
        System.out.println("Is Inflatable: " + isInflatable);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Sport: " + sport);
        System.out.println("Bounce Height: " + bounceHeight + " meters");
        System.out.println("Circumference: " + circumference + " cm");
        System.out.println("Has Grip: " + hasGrip);
        System.out.println("Pressure: " + pressure + " PSI");
        System.out.println("Is Water Resistant: " + isWaterResistant);
        System.out.println("Pattern: " + pattern);
        System.out.println("Is Used: " + isUsed);
        System.out.println("Max Load: " + maxLoad + " kg");
        System.out.println("Manufacture Date: " + manufactureDate);
        System.out.println("Origin Country: " + originCountry);
        System.out.println("Is Recyclable: " + isRecyclable);
        System.out.println("Hardness: " + hardness);
        System.out.println("Is Shiny: " + isShiny);
        System.out.println("Has Logo: " + hasLogo);
        System.out.println("Warranty Period: " + warrantyPeriod + " months");
        System.out.println("Is Customizable: " + isCustomizable);
        System.out.println("Custom Design: " + customDesign);
        System.out.println("===================");
    }
}
