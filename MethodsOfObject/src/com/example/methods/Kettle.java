package com.example.methods;

public class Kettle {
	private String brand;
	private double capacity;
	private String material;
	private String color;
	private int powerRating;
	private String type;

	public Kettle(String brand, double capacity, String material, String color, int powerRating, String type) {
		super();
		this.brand = brand;
		this.capacity = capacity;
		this.material = material;
		this.color = color;
		this.powerRating = powerRating;
		this.type = type;
	}

	public Kettle(String brand, double capacity, String material) {
		super();
		this.brand = brand;
		this.capacity = capacity;
		this.material = material;
	}

	@Override
	public String toString() {
		return "Kettle [brand=" + brand + ", capacity=" + capacity + ", material=" + material + ", color=" + color
				+ ", powerRating=" + powerRating + ", type=" + type + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {

			if (obj instanceof Kettle) {
				Kettle casted = (Kettle) obj;
				if (this.brand.equals(casted.brand) && this.capacity == casted.capacity
						&& this.material.equals(casted.material)) {
					System.out.println("Left is equal to right");
					return true;
				}
			} else {
				System.out.println("obj is not instance of Kettle");
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

	public int getPowerRating() {
		return powerRating;
	}

	public void setPowerRating(int powerRating) {
		this.powerRating = powerRating;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
