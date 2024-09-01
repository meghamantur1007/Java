package com.xworkz.things;

public class Government {
    String state;
    int noOfMlas;
    String partyHeadName;
    String homeMinisterName;

    public Government(String state, int noOfMlas, String partyHeadName, String homeMinisterName) {
        this.state = state;
        this.noOfMlas = noOfMlas;
        this.partyHeadName = partyHeadName;
        this.homeMinisterName = homeMinisterName;
    }

    public void displayDetails() {
        System.out.println("State: " + state);
        System.out.println("Number of MLAs: " + noOfMlas);
        System.out.println("Party Head: " + partyHeadName);
        System.out.println("Home Minister: " + homeMinisterName);
    }
}