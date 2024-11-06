package com.xworkz.servlet.dto;

public class ProductDTO {
	private String companyName;
	private String productName;
	private String productType;
	private int productQuantity;
	private double productCost;

	public ProductDTO(String companyName, String productName, String productType, int productQuantity,
			double productCost) {
		super();
		this.companyName = companyName;
		this.productName = productName;
		this.productType = productType;
		this.productQuantity = productQuantity;
		this.productCost = productCost;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public double getProductCost() {
		return productCost;
	}

	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}

	@Override
	public String toString() {
		return "ProductDTO [companyName=" + companyName + ", productName=" + productName + ", productType="
				+ productType + ", productQuantity=" + productQuantity + ", productCost=" + productCost + "]";
	}

}
