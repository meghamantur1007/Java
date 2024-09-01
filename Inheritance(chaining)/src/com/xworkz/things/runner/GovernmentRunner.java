package com.xworkz.things.runner;

import com.xworkz.things.CentralGovernment;
import com.xworkz.things.Government;
import com.xworkz.things.StateGovernment;

public class GovernmentRunner {
    public static void main(String[] args) {
        Government government = new Government("Karnataka", 224, "Siddaramaiah", "G. Parameshwara");
    
        Government stateGovernment1 = new StateGovernment("Maharashtra", 288, "Eknath Shinde", "Devendra Fadnavis");
        StateGovernment stateGovernment2 = new StateGovernment("Tamil Nadu", 234, "M. K. Stalin", "A. Raja");
      

        Government centralGovernment1 = new CentralGovernment("India", 543, "Narendra Modi", "Amit Shah");
        CentralGovernment centralGovernment2 = new CentralGovernment("India", 543, "Narendra Modi", "Rajnath Singh");
 
        
        government.displayDetails();
        System.out.println("===============");
        stateGovernment2.displayDetails();
        System.out.println();
        stateGovernment2.displayDetails();
        System.out.println("===============");
        centralGovernment1.displayDetails();
        System.out.println();
        centralGovernment2.displayDetails();
    }
}
