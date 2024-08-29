package com.xworkz.inheritance;

public class Bull {
	   
	    public  String breed;
	    public int age;
	    public double weight;
	    public String color;
	    public boolean isTrained;

	    
	    public void eat() {
	        System.out.println("The bull is eating.");
	    }

	 
	    public void sleep() {
	        System.out.println("The bull is sleeping.");
	    }

	    
	    public void run() {
	        System.out.println("The bull is running.");
	    }

	    
	    public void makeSound() {
	        System.out.println("The bull is making a sound.");
	    }

	   
	    public void displayDetails() {
	        System.out.println("Bull Details:");
	        System.out.println("Breed: " + breed);
	        System.out.println("Age: " + age);
	        System.out.println("Weight: " + weight + " kg");
	        System.out.println("Color: " + color);
	        System.out.println("Trained: " + isTrained);
	    }

}
