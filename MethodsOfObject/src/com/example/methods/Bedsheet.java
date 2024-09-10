package com.example.methods;

public class Bedsheet {

	private String size;
	private String color;
	private double cost;
	private String type;
	private String shopName;
	private int discount;

	public Bedsheet(String size, String color, double cost, String type, String shopName, int discount) {
		super();
		this.size = size;
		this.color = color;
		this.cost = cost;
		this.type = type;
		this.shopName = shopName;
		this.discount = discount;
	}

	public Bedsheet(String size, String color, String type) {
		super();
		this.size = size;
		this.color = color;
		this.type = type;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Bedsheet [size=" + size + ", color=" + color + ", cost=" + cost + ", type=" + type + ", shopName="
				+ shopName + ", discount=" + discount + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			if (obj instanceof Bedsheet) {
				Bedsheet casted = (Bedsheet) obj;
				if (this.size.equals(casted.size) && this.type.equals(casted.type) && this.color.equals(casted.color)) {
					System.out.println("Left is equal to right");
					return true;
				}

			} else {
				System.out.println("obj is not instance of Bedsheet");
			}
		} else {
			System.out.println("obj is null");
		}
		return super.equals(obj);
	}

}