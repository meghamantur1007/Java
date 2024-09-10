package com.example.methods;

public class Country {

	private String continent;
	private String name;
	private String capitalCity;
	private int states;
	private String president;
	private String pm;

	public Country(String continent, String name, String capitalCity, int states, String president, String pm) {
		super();
		this.continent = continent;
		this.name = name;
		this.capitalCity = capitalCity;
		this.states = states;
		this.president = president;
		this.pm = pm;
	}

	public Country(String continent, String name, String capitalCity) {
		super();
		this.continent = continent;
		this.name = name;
		this.capitalCity = capitalCity;
	}

	public int getStates() {
		return states;
	}

	public void setStates(int states) {
		this.states = states;
	}

	public String getPresident() {
		return president;
	}

	public void setPresident(String president) {
		this.president = president;
	}

	public String getPm() {
		return pm;
	}

	public void setPm(String pm) {
		this.pm = pm;
	}

	@Override
	public String toString() {
		return "Country [continent=" + continent + ", name=" + name + ", capitalCity=" + capitalCity + ", states="
				+ states + ", president=" + president + ", pm=" + pm + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			if (obj instanceof Country) {
				Country casted = (Country) obj;
				if (this.continent.equals(casted.continent) && this.name.equals(casted.name)
						&& this.capitalCity.equals(casted.capitalCity)) {
					System.out.println("Left is equal to right");
					return true;
				}

			} else {
				System.out.println("obj is not instance of Country");
			}
		} else {
			System.out.println("obj is null");
		}
		return super.equals(obj);
	}

}
