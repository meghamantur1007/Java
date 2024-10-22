package com.xworkz.servlet.dto;

public class CricketDTO {

	private String groundName;
	private String customerName;
	private String customerEmail;
	private String seatType;
	private int noOfTickets;

	public CricketDTO() {
	}

	public CricketDTO(String groundName, String customerName, String customerEmail, String seatType, int noOfTickets) {
		super();
		this.groundName = groundName;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.seatType = seatType;
		this.noOfTickets = noOfTickets;
	}

	@Override
	public String toString() {
		return "CricketDTO [groundName=" + groundName + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + ", seatType=" + seatType + ", noOfTickets=" + noOfTickets + "]";
	}

	public String getGroundName() {
		return groundName;
	}

	public void setGroundName(String groundName) {
		this.groundName = groundName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getSeatType() {
		return seatType;
	}

	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

}
