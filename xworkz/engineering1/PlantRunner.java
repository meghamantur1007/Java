package com.xworkz.engineering1;

import com.xworkz.engineering.Plant;


public class PlantRunner {

	public static void main(String[] args) {
	
		Plant plant=new Plant(true,"Forest",100,false,0.5);
		Plant plant1=new Plant(true, "Rainforest", 200, true, 1.5);
		Plant plant2=new Plant(false, "Desert", 50, false, 0.2);
		

		 Plant[] ref=new Plant[3];
				  ref[0]=plant;
				  ref[1]=plant1;
				  ref[2]=plant2;
        
	    for(Plant values:ref) {
						 
					  values.print();
				  }


}
}
