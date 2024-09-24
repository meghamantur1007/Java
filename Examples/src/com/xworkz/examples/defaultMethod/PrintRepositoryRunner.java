package com.xworkz.examples.defaultMethod;

public class PrintRepositoryRunner {

	public static void main(String[] args) {
		PrintRepository printRepository = new PrintRepositoryImpl();

		ServiceImpl serviceImpl = new ServiceImpl(printRepository);
		serviceImpl.display();
	}

}
