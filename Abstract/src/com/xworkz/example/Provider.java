package com.xworkz.example;

public abstract class Provider {
	String name;
	String ceoName;

	public Provider(String name, String ceoName) {
		super();
		this.name = name;
		this.ceoName = ceoName;
	}

	public abstract void service();
	
	@Override
	public String toString() {
		return "Provider [name=" + name + ", ceoName=" + ceoName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {

			if (obj instanceof Provider) {
				Provider casted = (Provider) obj;
				if (this.name.equals(casted.name) && this.ceoName.equals(casted.ceoName)) {
					System.out.println("Left is equal to right");
					return true;
				}
			} else {
				System.out.println("obj is not instance of Jeans");
			}
		} else {
			System.out.println("obj is null");
		}
		return super.equals(obj);
	}


}
