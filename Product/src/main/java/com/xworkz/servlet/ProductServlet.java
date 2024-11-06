package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.servlet.dto.ProductDTO;
import com.xworkz.servlet.service.ProductService;
import com.xworkz.servlet.service.ProductServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/product")
public class ProductServlet extends HttpServlet{

	public ProductServlet() {
		System.out.println("No arg const in ProductServlet ");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String companyName=req.getParameter("companyName");
		String productName=req.getParameter("productName");
		String productType=req.getParameter("productType");
		String productQuantity=req.getParameter("productQuantity");
		String productCost=req.getParameter("productCost");
		
		int productQuantityConverted=Integer.valueOf(productQuantity);
		double productCostConverted=Double.valueOf(productCost);

		ProductService service=new ProductServiceImpl();
		ProductDTO ProductDto=new ProductDTO(companyName, productName, productType, productQuantityConverted, productCostConverted);
		boolean valid=service.validAndSave(ProductDto);
		
		if(valid) {
			System.out.println("data is valid");
			double total=productQuantityConverted*productCostConverted;
			req.setAttribute("success", productName+":"+total);
		}
		else {
			System.out.println("data is invalid");
			req.setAttribute("dto", new ProductDTO(companyName, productName, productType, productQuantityConverted, productCostConverted));
			String validationerror="Validation Error";
			req.setAttribute("failure",validationerror);
			req.setAttribute(
					"dto1", new ProductDTO(companyName, productName, productType, productQuantityConverted, productCostConverted));
		}
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Product.jsp");
		requestDispatcher.forward(req, resp);
	}
}
