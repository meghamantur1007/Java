package com.xworkz.engineering;

public class Snake {

	 String name;
	 int length;
	 String type;
	 
	 public Snake( String name,int length,String type) {
		 this.name=name;
		 this.length=length;
		 this.type=type;
	 }
	public void print() {
		System.out.println("Snake Name:"+name);
		System.out.println("Snake length: "+length);
		System.out.println("Snake type"+type);
		
	}
}
