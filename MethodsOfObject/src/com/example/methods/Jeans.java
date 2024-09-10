package com.example.methods;

public class Jeans {
	private String brand;
	private int size;
	private String color;
	private String fitType;
	private double price;
	private String material;

	public Jeans(String brand, int size, String color, String fitType, double price, String material) {
		super();
		this.brand = brand;
		this.size = size;
		this.color = color;
		this.fitType = fitType;
		this.price = price;
		this.material = material;
	}

	public Jeans(String brand, int size, String color) {
		super();
		this.brand = brand;
		this.size = size;
		this.color = color;
	}

	public String getFitType() {
		return fitType;
	}

	public void setFitType(String fitType) {
		this.fitType = fitType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {

		return "Jeans [brand=" + brand + ", size=" + size + ", color=" + color + ", fitType=" + fitType + ", price="
				+ price + ", material=" + material + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {

			if (obj instanceof Jeans) {
				Jeans casted = (Jeans) obj;
				if (this.brand.equals(casted.brand) && this.size == casted.size && this.color.equals(casted.color)) {
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
