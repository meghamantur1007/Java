package com.xworkz.custom.runner;

import com.xworkz.custom.data.Sandal;
import com.xworkz.custom.store.SandalDataStore;

public class SandalRunner {

	public static void main(String[] args) {
		SandalDataStore data=new SandalDataStore();
		
		Sandal sandal=new Sandal("FootCraft",'M',1200,"Black");
		Sandal sandal1=new Sandal("StrideMate",'S',900,"Pink");
		Sandal sandal2=new Sandal("Paragon",'L',800,"White");
		Sandal sandal3=new Sandal("Puma",'M',1000,"Grey");
		Sandal sandal4=new Sandal("Sparx",'L',20000,"Blue");
		data.store(sandal);
		data.store(sandal1);
		data.store(sandal2);
		data.store(sandal3);
		data.store(sandal4);
		
		data.show();

	}

}
