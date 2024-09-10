package com.example.methods;

public class CreditCard {

	private String type;
	private String color;
	private String bank;
	private int expirationYear;
	private String holderName;
	private int cvccode;

	public CreditCard(String type, String color, String bank, int expirationYear, String holderName, int cvccode) {
		super();
		this.type = type;
		this.color = color;
		this.bank = bank;
		this.expirationYear = expirationYear;
		this.holderName = holderName;
		this.cvccode = cvccode;
	}

	public CreditCard(int expirationYear, String holderName, int cvccode) {
		super();
		this.expirationYear = expirationYear;
		this.holderName = holderName;
		this.cvccode = cvccode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	@Override
	public String toString() {
		return "CreditCard [type=" + type + ", color=" + color + ", bank=" + bank + ", expirationYear=" + expirationYear
				+ ", holderName=" + holderName + ", cvccode=" + cvccode + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			if (obj instanceof CreditCard) {
				CreditCard casted = (CreditCard) obj;
				if (this.holderName.equals(casted.holderName) && this.expirationYear == casted.expirationYear
						&& this.cvccode == casted.cvccode) {
					System.out.println("Left is equal to right");
					return true;
				}

			} else {
				System.out.println("obj is not instance of CreditCard");
			}
		} else {
			System.out.println("obj is null");
		}
		return super.equals(obj);
	}

}
