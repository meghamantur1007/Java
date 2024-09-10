package com.example.methods;

public class Grinder {
	private String brand;
	private double capacity;
	private String material;
	private String color;
	private double cost;
	private String type;

	public Grinder(String brand, double capacity, String material, String color, double cost, String type) {
		super();
		this.brand = brand;
		this.capacity = capacity;
		this.material = material;
		this.color = color;
		this.cost = cost;
		this.type = type;
	}

	public Grinder(String brand, double capacity, String material) {
		super();
		this.brand = brand;
		this.capacity = capacity;
		this.material = material;
	}

	@Override
	public String toString() {
		return "Grinder [brand=" + brand + ", capacity=" + capacity + ", material=" + material + ", color=" + color
				+ ", cost=" + cost + ", type=" + type + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {

			if (obj instanceof Grinder) {
				Grinder casted = (Grinder) obj;
				if (this.brand.equals(casted.brand) && this.material.equals(material) && this.cost == cost) {
					System.out.println("both are equal");
					return true;
				}
			} else {
				System.out.println("obj is not instance of Grinder");
			}
		} else {
			System.out.println("obj is null");
		}

		return super.equals(obj);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
