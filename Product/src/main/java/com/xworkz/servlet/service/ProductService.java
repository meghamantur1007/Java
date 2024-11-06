package com.xworkz.servlet.service;

import com.xworkz.servlet.dto.ProductDTO;

public interface ProductService {
	boolean validAndSave(ProductDTO productDto);
}
