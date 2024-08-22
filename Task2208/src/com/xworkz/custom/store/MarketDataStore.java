package com.xworkz.custom.store;

import com.xworkz.custom.data.Market;


public class MarketDataStore {

	Market[] stores=new Market[5];
	private int index=0;
	
	public void store(Market store) {
		this.stores[this.index]=store;
		index++;
	}
	public void show() {
		for(Market ref:stores) {
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
