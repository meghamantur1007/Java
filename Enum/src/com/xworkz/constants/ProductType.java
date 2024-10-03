package com.xworkz.constants;

public enum ProductType {
	KITCHEN, FOOTWEAR, FURRNITURE;

	private ProductType() {
		System.out.println("no arg const is created in ProductType");
	}
}
