package com.xworkz.custom.store;

import com.xworkz.custom.data.Sandal;


public class SandalDataStore {

	
	Sandal[] stores=new Sandal[5];
	private int index=0;
	
	public void store(Sandal store) {
		this.stores[this.index]=store;
		index++;
	}
	public void show() {
		for(Sandal ref:stores) {
			if (ref != null) {
				ref.display();
				System.out.println("==================");
				} 
			else {
				System.out.println("Data is null");
				}
			
		}
	}
	
}
