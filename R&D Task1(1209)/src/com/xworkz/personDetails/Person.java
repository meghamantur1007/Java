package com.xworkz.personDetails;

class Person {

	private String name;
	private String email;
	private int age;
	private String mobileNo;

	public Person(String name, String email, int age, String mobileNo) {
		this.name = name;
		this.email = email;
		this.age = age;
		this.mobileNo = mobileNo;
	}

	public void printDetails() {
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Age: " + age);
		System.out.println("Mobile No: " + mobileNo);
		System.out.println("----------------------");
	}
}
