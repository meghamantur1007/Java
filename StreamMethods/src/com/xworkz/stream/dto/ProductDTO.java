package com.xworkz.stream.dto;

import java.io.Serializable;

public class ProductDTO implements Serializable,Comparable<ProductDTO> {

	private int id;
	private String name;
	private String vendor;
	private double cost;

	public ProductDTO(int id, String name, String vendor, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.vendor = vendor;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", vendor=" + vendor + ", cost=" + cost + "]";
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public int compareTo(ProductDTO o) {
		return Double.compare(this.cost, o.cost);
		//this.name
	}


	

}

