package com.example.methods.runner;

import com.example.methods.CreditCard;

public class CreditCardRunner {

	public static void main(String[] args) {
		CreditCard card1 = new CreditCard(2029, "Megha", 1743);
		CreditCard card2 = new CreditCard(2026, "Trupthi", 1256);

		card1.setBank("hdfc");
		card1.setColor("blue");
		card1.setType("visa");

		card2.setBank("kotak");
		card2.setColor("red");
		card2.setType("mastercard");

		System.out.println(card1.toString());
		System.out.println(card2.toString());

		boolean same = card1.equals(card2);
		System.out.println("are card instances same :" + same);

	}

}
