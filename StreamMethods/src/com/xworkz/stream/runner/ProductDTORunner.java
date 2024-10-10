package com.xworkz.stream.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.stream.dto.ProductDTO;

public class ProductDTORunner {

	public static void main(String[] args) {

		ProductDTO product1 = new ProductDTO(1, "Laptop", "Dell", 8500.00);
		ProductDTO product2 = new ProductDTO(2, "Smartphone", "Samsung", 50000.00);
		ProductDTO product3 = new ProductDTO(3, "Headphones", "Sony", 1200.00);
		ProductDTO product4 = new ProductDTO(4, "Tablet", "Asus", 65000.00);
		ProductDTO product5 = new ProductDTO(5, "Smartwatch", "Apple", 1500.00);
		ProductDTO product6 = new ProductDTO(6, "Television", "LG", 5500.00);
		ProductDTO product7 = new ProductDTO(7, "Refrigerator", "Whirlpool", 4000.00);
		ProductDTO product8 = new ProductDTO(8, "Microwave", "Panasonic", 1500.00);
		ProductDTO product9 = new ProductDTO(9, "Washing Machine", "Bosch", 3000.00);
		ProductDTO product10 = new ProductDTO(10, "Air Conditioner", "Hitachi", 45000.00);

		Collection<ProductDTO> collection = new ArrayList<ProductDTO>();
		collection.add(product1);
		collection.add(product2);
		collection.add(product3);
		collection.add(product4);
		collection.add(product5);
		collection.add(product6);
		collection.add(product7);
		collection.add(product8);
		collection.add(product9);
		collection.add(product10);

		collection.forEach((ref) -> System.out.println(ref));

		System.out.println("==================================================================");
		System.out.println("sorting cost in ascending");
		collection.stream().sorted().forEach((ref1) -> System.out.println(ref1));

		System.out.println("==================================================================");
		System.out.println("Products greater than 5000");
		collection.stream().filter(ref -> ref.getCost() > 5000).forEach((ref) -> System.out.println(ref));

		System.out.println("==================================================================");
		System.out.println("Product cost greater than 5000 & less than 30000");
		collection.stream().filter(ref -> ref.getCost() > 5000 && ref.getCost() < 30000)
				.forEach((ref1) -> System.out.println(ref1));

		System.out.println("==================================================================");
		System.out.println("Product sort in desc by cost");
		collection.stream().sorted((ref1, ref2) -> Double.compare(ref2.getCost(), ref1.getCost()))
				.collect(Collectors.toList()).forEach((ref) -> System.out.println(ref));

		System.out.println("==================================================================");
		System.out.println("Product where vendor names starts with A and sort by asc by name");
		collection.stream().filter(ref -> ref.getVendor().startsWith("A"))
				.sorted((ref1, ref2) -> ref1.getVendor().compareTo(ref2.getVendor())).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));
		
		
		System.out.println("==================================================================");
		System.out.println("Only names from product");
		collection.stream().map(product -> product.getName()).forEach(ref -> System.out.println(ref));

		System.out.println("==================================================================");
		System.out.println("Only id from product");
		collection.stream().map(product -> product.getId()).forEach(ref -> System.out.println(ref));

		System.out.println("==================================================================");
		System.out.println("Converting name to uppercase");
		collection.stream().map(product -> product.getName().toUpperCase()).forEach(ref -> System.out.println(ref));

	}

}
