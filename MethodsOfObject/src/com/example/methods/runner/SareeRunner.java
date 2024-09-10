package com.example.methods.runner;


import com.example.methods.Saree;

public class SareeRunner {

	public static void main(String[] args) {
		Saree saree1=new Saree("Nalli", "Silk", "Red");
		Saree saree2=new Saree("Nalli", "Silk", "Red");
		
		
		saree1.setLength(6.5);
		saree1.setPrice(5000);
		saree1.setType("Kanjivaram");
		
		saree2.setLength(6.0);
		saree2.setPrice(4000);
		saree2.setType("Chanderi");
		
		System.out.println(saree1.toString());
		System.out.println(saree2.toString());
		
		
		boolean store=saree1.equals(saree2);
		System.out.println("Are the saree instances same:"+store);

		
	}

}
