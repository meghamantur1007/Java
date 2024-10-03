package com.xworkz.constants;

public enum TicketType {
	ONLINE(200), OFFLINE(250);

	private int cost;

	private TicketType(int cost) {
		this.cost = cost;
	}

	public int getCost() {
		return cost;
	}
}