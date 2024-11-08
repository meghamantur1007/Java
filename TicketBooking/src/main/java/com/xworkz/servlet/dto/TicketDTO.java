package com.xworkz.servlet.dto;

public class TicketDTO {

	private String stadiumName;
	private int tickets;
	private long primaryContact;
	private String email;
	
	public TicketDTO() {
	}

	public TicketDTO(String stadiumName, int tickets, long primaryContact, String email) {
		super();
		this.stadiumName = stadiumName;
		this.tickets = tickets;
		this.primaryContact = primaryContact;
		this.email = email;
	}
	
	
	public TicketDTO(int tickets, long primaryContact, String email) {
		super();
		this.tickets = tickets;
		this.primaryContact = primaryContact;
		this.email = email;
	}

	@Override
	public String toString() {
		return "TicketDTO [stadiumName=" + stadiumName + ", tickets=" + tickets + ", primaryContact=" + primaryContact
				+ ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + (int) (primaryContact ^ (primaryContact >>> 32));
		result = prime * result + ((stadiumName == null) ? 0 : stadiumName.hashCode());
		result = prime * result + tickets;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof TicketDTO)) {
			return false;
		}
		TicketDTO other = (TicketDTO) obj;
		if (email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!email.equals(other.email)) {
			return false;
		}
		if (primaryContact != other.primaryContact) {
			return false;
		}
		if (stadiumName == null) {
			if (other.stadiumName != null) {
				return false;
			}
		} else if (!stadiumName.equals(other.stadiumName)) {
			return false;
		}
		if (tickets != other.tickets) {
			return false;
		}
		return true;
	}

	public String getStadiumName() {
		return stadiumName;
	}

	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}

	public int getTickets() {
		return tickets;
	}

	public void setTickets(int tickets) {
		this.tickets = tickets;
	}

	public long getPrimaryContact() {
		return primaryContact;
	}

	public void setPrimaryContact(long primaryContact) {
		this.primaryContact = primaryContact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

}
