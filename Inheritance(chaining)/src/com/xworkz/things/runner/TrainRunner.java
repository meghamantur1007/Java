package com.xworkz.things.runner;

import com.xworkz.things.SubUrbanTrain;
import com.xworkz.things.MetroTrain;
import com.xworkz.things.Train;

public class TrainRunner {

	public static void main(String[] args) {
		Train train1=new Train(301,"Bangalore","Pune");
	    
	        
		MetroTrain metro1 = new MetroTrain( "MG Road", "Whitefield");
        Train train = new MetroTrain( "Yeshwanthpur", "Hebbal");

       
        SubUrbanTrain subUrban1 = new SubUrbanTrain(201, "KSR Bengaluru", "Mysuru");
        Train train2 = new SubUrbanTrain(202, "Bengaluru Cantt", "Baiyyappanahalli");
        
        
        System.out.println("One copy of train:");
        train1.display();
     
        System.out.println("===========================");
        System.out.println("Two copies of MetroTrain:");
        metro1.print();
        System.out.println();
        train2.print();
     
        System.out.println("===========================");
        System.out.println("Two copies of SubUrban:");
        subUrban1.display();
        System.out.println();
        train2.display();
        
      
		}

}
