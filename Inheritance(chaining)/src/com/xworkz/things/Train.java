package com.xworkz.things;

public class Train {

	private int train_no;
	private String source;
	private String destination;

	public Train(int train_no) {
		this.train_no = train_no;

	}

	public Train(String source, String destination) {
		this.source = source;
		this.destination = destination;
	}

	public Train(int train_no, String source, String destination) {
		this.train_no = train_no;
		this.source = source;
		this.destination = destination;
	}

	public void print() {
		System.out.println("Source:" + source);
		System.out.println("Destination:" + destination);
	}

	public void display() {
		System.out.println("Train Number:" + train_no);
		System.out.println("Source:" + source);
		System.out.println("Destination:" + destination);
	}

}
