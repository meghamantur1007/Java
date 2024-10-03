package com.xworkz.constants.runner;

import com.xworkz.constants.CustomerDTO;
import com.xworkz.constants.ProductType;

public class CustomerDTORunner {

	public static void main(String[] args) {
		CustomerDTO customer = new CustomerDTO("Megha M", "meghamantur@gmail.com", ProductType.FOOTWEAR);
		System.out.println("Customer Name: " + customer.getName());
		System.out.println("Customer Email: " + customer.getEmail());
		System.out.println("Product Type: " + customer.getProductType());
	}

}
