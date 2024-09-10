package com.example.methods;

public class Saree {
	private String brand;
	private String material;
	private String color;
	private double length;
	private double price;
	private String type;

	public Saree(String brand, String material, String color, double length, double price, String type) {
		this.brand = brand;
		this.material = material;
		this.color = color;
		this.length = length;
		this.price = price;
		this.type = type;
	}

	public Saree(String brand, String material, String color) {
		this.brand = brand;
		this.material = material;
		this.color = color;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Saree [brand=" + brand + ", material=" + material + ", color=" + color + ", length=" + length
				+ ", price=" + price + ", type=" + type + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {

			if (obj instanceof Saree) {
				Saree casted = (Saree) obj;
				if (this.brand.equals(casted.brand) && this.material.equals(material)
						&& this.color.equals(casted.color)) {
					System.out.println("Left is equal to right");
					return true;
				}
			} else {
				System.out.println("obj is not instance of Jeans");
			}
		} else {
			System.out.println("obj is null");
		}

		return super.equals(obj);
	}
}
