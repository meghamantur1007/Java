package com.xworkz.servlet.service;

import com.xworkz.servlet.dto.ProductDTO;

public class ProductServiceImpl implements ProductService{

	@Override
	public boolean validAndSave(ProductDTO productDto) {

		boolean valid=true;
		if(productDto!=null) {
			String companyName=productDto.getCompanyName();
			if(companyName!=null&&!companyName.isEmpty()&&companyName.length()>3 && companyName.length()<=50) {
				System.out.println("Company Name is valid");
			}
			else {
				valid=false;
				System.out.println("Company Name is not valid");
			}
			int productQuantity=productDto.getProductQuantity();
			if(productQuantity>0 &&productQuantity<10) {
				System.out.println("Product Quantity is valid");
			}
			else {
				valid=false;
				System.out.println("Product Quantity is not valid");
			}
			double productCost=productDto.getProductCost();
			if(productCost>100) {
				System.out.println("Product Cost is valid");
			}
			else {
				valid=false;
				System.out.println("Product Cost is not valid");
			}
		}
		return valid;
	}

	
}
