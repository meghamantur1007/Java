package com.xworkz.collections.DTO;

import java.io.Serializable;

public class MatchBoxDTO<J, K> implements Serializable {
	private J cost;
	private K brand;

	public MatchBoxDTO() {
		System.out.println("no arg const");
	}

	public MatchBoxDTO(J cost, K brand) {
		this.cost = cost;
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "MatchBox [cost=" + cost + ", brand=" + brand + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((cost == null) ? 0 : cost.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof MatchBoxDTO)) {
			return false;
		}
		MatchBoxDTO other = (MatchBoxDTO) obj;
		if (brand == null) {
			if (other.brand != null) {
				return false;
			}
		} else if (!brand.equals(other.brand)) {
			return false;
		}
		if (cost == null) {
			if (other.cost != null) {
				return false;
			}
		} else if (!cost.equals(other.cost)) {
			return false;
		}
		return true;
	}

	public J getCost() {
		return cost;
	}

	public void setCost(J cost) {
		this.cost = cost;
	}

	public K getBrand() {
		return brand;
	}

	public void setBrand(K brand) {
		this.brand = brand;
	}

}
