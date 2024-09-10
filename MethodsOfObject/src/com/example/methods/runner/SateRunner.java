package com.example.methods.runner;

import com.example.methods.State;

public class SateRunner {

	public static void main(String[] args) {
		State state = new State("India", "Karnataka", "Bengaluru");
		State state1 = new State("India", "Tamil Nadu", "Chennai");

		state.setCm("Siddaramaiah");
		state.setGovernor("tawar chand gehlot");
		state.setNoOfCities(26);

		state1.setCm("mk stalin");
		state1.setGovernor("rn ravi");
		state1.setNoOfCities(30);

		System.out.println(state.toString());
		System.out.println(state1.toString());

		boolean same = state1.equals(state);
		System.out.println("are the state instances same :" + same);
	}

}
