package com.xworkz.constants;

public class TicketBookDTO {
	String movieName;
	String theaterName;
	TicketType ticketType;
	SeatType seatType;

	public TicketBookDTO(String movieName, String theaterName, TicketType ticketType, SeatType seatType) {
		super();
		this.movieName = movieName;
		this.theaterName = theaterName;
		this.ticketType = ticketType;
		this.seatType = seatType;
	}

	public String getMovieName() {
		return movieName;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public TicketType getTicketType() {
		return ticketType;
	}

	public SeatType getSeatType() {
		return seatType;
	}

}
