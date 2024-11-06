package com.xworkz.map.dto;



public class AddressDTO {

	private int no;
	private String street;
	private String city;
	private String state;
	private CountryDTO countryDTO;
	
	
	public AddressDTO(int no, String street, String city, String state, CountryDTO countryDTO) {
		super();
		this.no = no;
		this.street = street;
		this.city = city;
		this.state = state;
		this.countryDTO = countryDTO;
	}


	@Override
	public String toString() {
		return "AddressDTO [no=" + no + ", street=" + street + ", city=" + city + ", state=" + state + ", countryDTO="
				+ countryDTO + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((countryDTO == null) ? 0 : countryDTO.hashCode());
		result = prime * result + no;
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof AddressDTO)) {
			return false;
		}
		AddressDTO other = (AddressDTO) obj;
		if (city == null) {
			if (other.city != null) {
				return false;
			}
		} else if (!city.equals(other.city)) {
			return false;
		}
		if (countryDTO == null) {
			if (other.countryDTO != null) {
				return false;
			}
		} else if (!countryDTO.equals(other.countryDTO)) {
			return false;
		}
		if (no != other.no) {
			return false;
		}
		if (state == null) {
			if (other.state != null) {
				return false;
			}
		} else if (!state.equals(other.state)) {
			return false;
		}
		if (street == null) {
			if (other.street != null) {
				return false;
			}
		} else if (!street.equals(other.street)) {
			return false;
		}
		return true;
	}
	
	
}
