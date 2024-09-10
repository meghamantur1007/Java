package com.example.methods;

public class Bulb {

	private double cost;
	private String company;
	private int warranty;
	private String color;
	private int voltage;
	private int wattage;

	public Bulb(double cost, String company, int warranty, String color, int voltage, int wattage) {
		super();
		this.cost = cost;
		this.company = company;
		this.warranty = warranty;
		this.color = color;
		this.voltage = voltage;
		this.wattage = wattage;
	}

	public Bulb(String company, int voltage, int wattage) {
		super();
		this.company = company;
		this.voltage = voltage;
		this.wattage = wattage;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Bulb [cost=" + cost + ", company=" + company + ", warranty=" + warranty + ", color=" + color
				+ ", voltage=" + voltage + ", wattage=" + wattage + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			if (obj instanceof Bulb) {
				Bulb casted = (Bulb) obj;
				if (this.company.equals(casted.company) && this.voltage == casted.voltage
						&& this.wattage == casted.wattage) {
					System.out.println("left is equal to right");
					return true;
				}

			} else {
				System.out.println("obj is not instance of Bulb");
			}
		} else {
			System.out.println("obj is null");
		}
		return super.equals(obj);
	}

}
