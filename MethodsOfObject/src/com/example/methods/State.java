package com.example.methods;

public class State {

	private String country;
	private String stateName;
	private int noOfCities;
	private String capital;
	private String cm;
	private String governor;

	public State(String country, String stateName, int noOfCities, String capital, String cm, String governor) {
		super();
		this.country = country;
		this.stateName = stateName;
		this.noOfCities = noOfCities;
		this.capital = capital;
		this.cm = cm;
		this.governor = governor;
	}

	public State(String country, String stateName, String capital) {
		super();
		this.country = country;
		this.stateName = stateName;
		this.capital = capital;
	}

	public int getNoOfCities() {
		return noOfCities;
	}

	public void setNoOfCities(int noOfCities) {
		this.noOfCities = noOfCities;
	}

	public String getCm() {
		return cm;
	}

	public void setCm(String cm) {
		this.cm = cm;
	}

	public String getGovernor() {
		return governor;
	}

	public void setGovernor(String governor) {
		this.governor = governor;
	}

	@Override
	public String toString() {
		return "State [country=" + country + ", stateName=" + stateName + ", noOfCities=" + noOfCities + ", capital="
				+ capital + ", cm=" + cm + ", governor=" + governor + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			if (obj instanceof State) {
				State casted = (State) obj;
				if (this.country.equals(casted.country) && this.stateName.equals(casted.stateName)
						&& this.capital.equals(casted.capital)) {
					System.out.println("Left is equal to right");
					return true;
				}

			} else {
				System.out.println("obj is not instance of State");
			}
		} else {
			System.out.println("obj is null");
		}
		return super.equals(obj);
	}

}
