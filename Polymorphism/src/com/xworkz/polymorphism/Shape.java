
//Compile-time polymorphism is achieved through method overloading.
//Method overloading allows a class to have more than one method with the same name but different parameters (different type, number, or both).

package com.xworkz.polymorphism;

public class Shape {
	
	double area(int radius) {
		double area=3.14 * radius * radius;
		System.out.println("Are Of Circle:"+area);
		return  0;
	}
	
	
	double area(double height,double width) {
		double areaOfSquare=height*width;
		System.out.println("Are Of Square:"+areaOfSquare);
			return 0;
		}
	}




