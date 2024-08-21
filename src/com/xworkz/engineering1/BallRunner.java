package com.xworkz.engineering1;
import com.xworkz.engineering.Ball;
public class BallRunner {

	public static void main(String[] args) {
		
	  
	        Ball ball = new Ball("Red", "Leather", 22.5, 450, true, "Nike", "Soccer", "Soccer");
	        Ball ball1 = new Ball("Blue", "Rubber", 20.0, 500, false, "Adidas", "Training", "Basketball");
	        Ball ball2 = new Ball("Green", "Synthetic", 24.0, 300, true, "Puma", "Match", "Football");

	        
	        ball.setBounceHeight(1.2);
	        ball.setCircumference(70.0);
	        ball.setHasGrip(true);
	        ball.setPressure(8);
	        ball.setIsWaterResistant(true);
	        ball.setPattern("Stripes");
	        ball.setIsUsed(false);
	        ball.setMaxLoad(5.0);
	        ball.setManufactureDate("2023-07-01");
	        ball.setOriginCountry("USA");
	        ball.setIsRecyclable(true);
	        ball.setHardness(8.5);
	        ball.setIsShiny(true);
	        ball.setHasLogo(true);
	        ball.setWarrantyPeriod(12);
	        ball.setIsCustomizable(true);
	        ball.setCustomDesign("Floral");

	        ball1.setBounceHeight(1.0);
	        ball1.setCircumference(68.0);
	        ball1.setHasGrip(true);
	        ball1.setPressure(9);
	        ball1.setIsWaterResistant(false);
	        ball1.setPattern("Solid");
	        ball1.setIsUsed(true);
	        ball1.setMaxLoad(4.0);
	        ball1.setManufactureDate("2024-01-15");
	        ball1.setOriginCountry("Germany");
	        ball1.setIsRecyclable(false);
	        ball1.setHardness(7.0);
	        ball1.setIsShiny(false);
	        ball1.setHasLogo(true);
	        ball1.setWarrantyPeriod(6);
	        ball1.setIsCustomizable(false);
	        ball1.setCustomDesign("None");
	       
	        
	        ball2.setBounceHeight(1.5);
	        ball2.setCircumference(72.0);
	        ball2.setHasGrip(true);
	        ball2.setPressure(7);
	        ball2.setIsWaterResistant(true);
	        ball2.setPattern("Hexagonal");
	        ball2.setIsUsed(false);
	        ball2.setMaxLoad(6.0); 
	        ball2.setManufactureDate("2023-11-30");
	        ball2.setOriginCountry("China");
	        ball2.setIsRecyclable(true);
	        ball2.setHardness(9.0);
	        ball2.setIsShiny(true);
	        ball2.setHasLogo(true);
	        ball2.setWarrantyPeriod(18);
	        ball2.setIsCustomizable(true);
	        ball2.setCustomDesign("Geometric");
	      
	        	Ball[] ref=new Ball[3];
	        	ref[0]=ball;
	        	ref[1]=ball1;
	        	ref[2]=ball2;
	        	
	        	for(Ball values:ref) {
	 
	        values.printBallDetails();
	    }
	}

	}


