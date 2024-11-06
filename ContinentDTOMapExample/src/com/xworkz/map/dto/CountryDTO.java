package com.xworkz.map.dto;

public class CountryDTO {

	private String name;
	private int code;

	public CountryDTO(String name, int code) {
		super();
		this.name = name;
		this.code = code;
	}

	@Override
	public String toString() {
		return "CountryDTO [name=" + name + ", code=" + code + "]";
	}
	

	public String getName() {
		return name;
	}

	public int getCode() {
		return code;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + code;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof CountryDTO)) {
			return false;
		}
		CountryDTO other = (CountryDTO) obj;
		if (code != other.code) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

}
