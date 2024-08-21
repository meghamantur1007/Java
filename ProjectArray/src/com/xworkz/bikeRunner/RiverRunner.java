package com.xworkz.bikeRunner;


import com.xworkx.bike.River;

public class RiverRunner {

	public static void main(String[] args) {
	River river=new River();
		
	river.store("Ganges");
	river.store("Yamuna");
	river.store("Narmada");
	river.store("Godavari");
	river.store("Krishna");
	river.store("Kaveri");
	river.store("Brahmaputra");
		
		
		river.display();
	}

}
