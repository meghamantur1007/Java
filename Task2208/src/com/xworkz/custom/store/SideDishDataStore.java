package com.xworkz.custom.store;

import com.xworkz.custom.data.SideDish;

public class SideDishDataStore {
	SideDish[] stores=new SideDish[5];
	private int index=0;
	
	public void store(SideDish dishName) {
		stores[index]=dishName;
		index++;
	}
	public void show() {
		for(SideDish ref:stores) {
			if(ref!=null) {
				ref.display();
				System.out.println("================");
			}
			else {
				System.out.println("Data is null");
			}
		}
	}
}
