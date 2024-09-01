package com.xworkz.things.runner;

import com.xworkz.things.Market;
import com.xworkz.things.OnlineMarket;
import com.xworkz.things.SuperMarket;

public class MarketRunner {

	public static void main(String[] args) {
		Market market=new Market("Generic Market", "City Center", 50, "Physical");
	
		SuperMarket superMarket=new SuperMarket("D-Mart", "Pune");
		Market superMarket1=new SuperMarket("Reliance Fresh", "Hyderabad");
		
		
		OnlineMarket onlineMarket=new OnlineMarket("Flipkart", "Online", 80000, "Digital");
		Market onlineMarket1=new OnlineMarket("Myntra", "Online", 50000, "Digital");
	
		
		market.displayDetails();
		
		System.out.println("============================");
		superMarket.display();
		System.out.println();
		superMarket1.display();
		
		System.out.println("============================");
		onlineMarket.displayDetails();
		System.out.println();
		onlineMarket1.displayDetails();
	}

}
