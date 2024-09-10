package com.example.methods;

public class Helmet {

	private String color;
	private String brand;
	private String type;
	private double price;
	private int weight;
	private String material;

	public Helmet(String color, String brand, String type, double price, int weight, String material) {
		super();
		this.color = color;
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.weight = weight;
		this.material = material;
	}

	public Helmet(String color, String brand, String type) {
		super();
		this.color = color;
		this.brand = brand;
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Helmet [color=" + color + ", brand=" + brand + ", type=" + type + ", price=" + price + ", weight="
				+ weight + ", material=" + material + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			if (obj instanceof Helmet) {
				Helmet casted = (Helmet) obj;
				if (this.color.equals(casted.color) && this.brand.equals(casted.brand)
						&& this.type.equals(casted.type)) {
					System.out.println("Left is equal to right");
					return true;
				}

			} else {
				System.out.println("obj is not instance of Helmet");
			}
		} else {
			System.out.println("obj is null");
		}
		return super.equals(obj);
	}

}
