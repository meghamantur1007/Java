package com.xworkz.servlet.dto;

public class ConcertTiketDTO {
	private String location;
	private String artistName;
	private String ticketType;
	private int totalTickets;
	private String prefernceType;

	public ConcertTiketDTO() {
	}

	public ConcertTiketDTO(String location, String artistName, String ticketType, int totalTickets,String prefernceType) {
		super();
		this.location = location;
		this.artistName = artistName;
		this.ticketType = ticketType;
		this.totalTickets = totalTickets;
		this.prefernceType = prefernceType;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getTicketType() {
		return ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	public int getTotalTickets() {
		return totalTickets;
	}

	public void setTotalTickets(int totalTickets) {
		this.totalTickets = totalTickets;
	}

	public String getPrefernceType() {
		return prefernceType;
	}

	public void setPrefernceType(String prefernceType) {
		this.prefernceType = prefernceType;
	}

	@Override
	public String toString() {
		return "ConcertTiketDTO [location=" + location + ", artistName=" + artistName + ", ticketType=" + ticketType
				+ ", totalTickets=" + totalTickets + ", prefernceType=" + prefernceType + "]";
	}

	public ConcertTiketDTO(String location, String artistName, String ticketType, String seatType, int totalTickets,
			String prefernceType) {
		super();
		this.location = location;
		this.artistName = artistName;
		this.ticketType = ticketType;
		this.totalTickets = totalTickets;
		this.prefernceType = prefernceType;
	}
}
