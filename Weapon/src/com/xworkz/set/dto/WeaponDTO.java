package com.xworkz.set.dto;

import java.time.LocalDate;


public class WeaponDTO {
	private int id;
	private String name;
	private String countryMade;
	private LocalDate manfDate;

	public WeaponDTO(int id, String name, String countryMade, LocalDate manfDate) {
		super();
		this.id = id;
		this.name = name;
		this.countryMade = countryMade;
		this.manfDate = manfDate;
	}

	@Override
	public String toString() {
		return "WeaponDto [id=" + id + ", name=" + name + ", countryMade=" + countryMade + ", manfDate=" + manfDate
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((countryMade == null) ? 0 : countryMade.hashCode());
		result = prime * result + id;
		result = prime * result + ((manfDate == null) ? 0 : manfDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof WeaponDTO)) {
			return false;
		}
		WeaponDTO other = (WeaponDTO) obj;
		if (countryMade == null) {
			if (other.countryMade != null) {
				return false;
			}
		} else if (!countryMade.equals(other.countryMade)) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (manfDate == null) {
			if (other.manfDate != null) {
				return false;
			}
		} else if (!manfDate.equals(other.manfDate)) {
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryMade() {
		return countryMade;
	}

	public void setCountryMade(String countryMade) {
		this.countryMade = countryMade;
	}

	public LocalDate getManfDate() {
		return manfDate;
	}

	public void setManfDate(LocalDate manfDate) {
		this.manfDate = manfDate;
	}

}
