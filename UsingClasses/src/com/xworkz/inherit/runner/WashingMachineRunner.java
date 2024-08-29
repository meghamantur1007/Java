package com.xworkz.inherit.runner;
	import com.xworkz.inherit.Abhishek;
	import com.xworkz.inherit.Bhumika;
	import com.xworkz.inherit.Lakshmi;
	import com.xworkz.inherit.Megha;
	import com.xworkz.inherit.Nayana;
	import com.xworkz.inherit.WashingMachine;

	public class WashingMachineRunner {

		public static void main(String[] args) {

			Megha megha=new Megha();
			megha.wash();
			System.out.println("-----------------------");

			WashingMachine washingmachine=new WashingMachine("Onida","top-load",7);
			Lakshmi lakshmi=new Lakshmi();
			lakshmi.load(washingmachine);
			System.out.println("-----------------------");


			Nayana nayana=new Nayana();
			nayana.addFabricConditioner();
			System.out.println("-----------------------");

			Bhumika bhumika=new Bhumika();
			bhumika.powerOff();
			System.out.println("-----------------------");

			Abhishek abhishek=new Abhishek(washingmachine);
			abhishek.powerOn();

		}
}
