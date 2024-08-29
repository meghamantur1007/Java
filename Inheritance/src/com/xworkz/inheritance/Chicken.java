package com.xworkz.inheritance;

public class Chicken {
	public String breed;
	public int age;
	public double weight;
	public String color;
	public boolean isFreeRange;
    public int eggProductionPerWeek;
    public String featherType;
    public boolean hasComb;
    public boolean isVaccinated;
    public double dailyFeedAmount; 

    
    public void layEgg() {
        System.out.println("The chicken is laying an egg.");
    }

   
    public void eat() {
        System.out.println("The chicken is eating.");
    }

    
    public void sleep() {
        System.out.println("The chicken is sleeping.");
    }

    
    public void scratchGround() {
        System.out.println("The chicken is scratching the ground.");
    }

 
    public void displayDetails() {
        System.out.println("Chicken Details:");
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Color: " + color);
        System.out.println("Free Range: " + (isFreeRange ? "Yes" : "No"));
        System.out.println("Egg Production Per Week: " + eggProductionPerWeek);
        System.out.println("Feather Type: " + featherType);
        System.out.println("Has Comb: " + (hasComb ? "Yes" : "No"));
        System.out.println("Vaccinated: " + (isVaccinated ? "Yes" : "No"));
        System.out.println("Daily Feed Amount: " + dailyFeedAmount + " kg");
    }

}
