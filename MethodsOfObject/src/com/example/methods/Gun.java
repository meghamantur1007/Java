package com.example.methods;

public class Gun {

	private double cost;
	private String type;
	private String manufacturedCountry;
	private String name;
	private boolean isReal;
	private String material;

	public Gun(double cost, String type, String manufacturedCountry, String name, boolean isReal, String material) {
		super();
		this.cost = cost;
		this.type = type;
		this.manufacturedCountry = manufacturedCountry;
		this.name = name;
		this.isReal = isReal;
		this.material = material;
	}

	public Gun(double cost, String manufacturedCountry, String name) {
		super();
		this.cost = cost;
		this.manufacturedCountry = manufacturedCountry;
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isReal() {
		return isReal;
	}

	public void setReal(boolean isReal) {
		this.isReal = isReal;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Gun [cost=" + cost + ", type=" + type + ", manufacturedCountry=" + manufacturedCountry + ", name="
				+ name + ", isReal=" + isReal + ", material=" + material + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			if (obj instanceof Gun) {
				Gun casted = (Gun) obj;
				if (this.manufacturedCountry.equals(casted.manufacturedCountry) && this.name.equals(casted.name)
						&& this.cost == casted.cost) {
					System.out.println("Left is equal to right");
					return true;
				}

			} else {
				System.out.println("obj is not instance of Gun");
			}
		} else {
			System.out.println("obj is null");
		}
		return super.equals(obj);
	}

}
