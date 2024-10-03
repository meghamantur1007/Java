package com.xworkz.constants;

public enum SeatType {
	RECLINER(1), PREMIUM(2), EXECUTIVE(3);

	private int seatNo;

	private SeatType(int seatNo) {
		this.seatNo = seatNo;
	}

	public int getSeatNo() {
		return seatNo;
	}
}
