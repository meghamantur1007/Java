package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.Halwa;
import com.xworkz.inheritance.Sweet;


public class HalwaRunner {

	public static void main(String[] args) {
		
		Halwa halwa=new Halwa();
		halwa.name="Badam Halwa";
		
		Halwa halwa1=new Sweet();
		halwa1.sweetnessLevel=9;
		halwa1.weight=20.0;
		
		halwa1.printName();
		halwa1.printSweetnessLevel();
	}

}