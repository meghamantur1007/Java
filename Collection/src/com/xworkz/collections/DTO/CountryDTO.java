package com.xworkz.collections.DTO;

import java.io.Serializable;

import com.xworkz.collections.constants.Code;
import com.xworkz.collections.constants.Continent;

public class CountryDTO<S, D> implements Serializable {
	private S name;
	private Code code;
	private D population;
	private S presidentName;
	private Continent continent;

	public CountryDTO() {
		super();
	}

	public CountryDTO(S name, Code code, D population, S presidentName, Continent continent) {
		this.name = name;
		this.code = code;
		this.population = population;
		this.presidentName = presidentName;
		this.continent = continent;

	}

	@Override
	public String toString() {
		return "CountryDTO [name=" + name + ", code=" + code + ", population=" + population + ", presidentName="
				+ presidentName + ", continent=" + continent + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((continent == null) ? 0 : continent.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((population == null) ? 0 : population.hashCode());
		result = prime * result + ((presidentName == null) ? 0 : presidentName.hashCode());
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
		if (continent != other.continent) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (population == null) {
			if (other.population != null) {
				return false;
			}
		} else if (!population.equals(other.population)) {
			return false;
		}
		if (presidentName == null) {
			if (other.presidentName != null) {
				return false;
			}
		} else if (!presidentName.equals(other.presidentName)) {
			return false;
		}
		return true;
	}

	public S getName() {
		return name;
	}

	public void setName(S name) {
		this.name = name;
	}

	public Code getCode() {
		return code;
	}

	public void setCode(Code code) {
		this.code = code;
	}

	public D getPopulation() {
		return population;
	}

	public void setPopulation(D population) {
		this.population = population;
	}

	public S getPresidentName() {
		return presidentName;
	}

	public void setPresidentName(S presidentName) {
		this.presidentName = presidentName;
	}

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

}
