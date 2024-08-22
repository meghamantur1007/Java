package com.xworkz.custom.runner;

import com.xworkz.custom.data.Market;
import com.xworkz.custom.store.MarketDataStore;

public class MarketRunner {

	public static void main(String[] args) {
	MarketDataStore data=new MarketDataStore();
		
		Market market=new Market("City Plaza","Bangalore");
		Market market1=new Market("Metro Mart","Mumbai");
		Market market2=new Market("Green Market","Chennai");
		Market market3=new Market("Sunrise Bazaar","Hyderabad");
		Market market4=new Market("Royal Market","Delhi");
		data.store(market);
		data.store(market1);
		data.store(market2);
		data.store(market3);
		data.store(market4);
		
		data.show();


	}

}
