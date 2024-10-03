package com.xworkz.constants.runner;

import com.xworkz.constants.SeatType;
import com.xworkz.constants.TicketBookDTO;
import com.xworkz.constants.TicketType;

public class TicketBookDTORunner {

	public static void main(String[] args) {
		TicketBookDTO ticketBookDTO=new TicketBookDTO("Mussanje Maathu","Inox",TicketType.ONLINE,SeatType.PREMIUM);
		System.out.println("Movie Name:"+ticketBookDTO.getMovieName());
		System.out.println("Theatre Name:"+ticketBookDTO.getTheaterName());
		System.out.println("Ticket Type:"+ticketBookDTO.getTicketType()+","+"Ticket Cost:"+ticketBookDTO.getTicketType().getCost());
		System.out.println("Seat Type:"+ticketBookDTO.getSeatType()+","+"Seat Number:"+ticketBookDTO.getSeatType().getSeatNo());
	}

}
