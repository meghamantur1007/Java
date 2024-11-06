package com.xworkz.map.dto;

public class PresidentDTO {
	private String name;
	private int age;
	private String primaryWork;
	private AddressDTO address;

	public PresidentDTO(String name, int age, String primaryWork, AddressDTO address) {
		super();
		this.name = name;
		this.age = age;
		this.primaryWork = primaryWork;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPrimaryWork() {
		return primaryWork;
	}

	public void setPrimaryWork(String primaryWork) {
		this.primaryWork = primaryWork;
	}

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "PresidentDTO [name=" + name + ", age=" + age + ", primaryWork=" + primaryWork + ", address=" + address
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((primaryWork == null) ? 0 : primaryWork.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof PresidentDTO)) {
			return false;
		}
		PresidentDTO other = (PresidentDTO) obj;
		if (address == null) {
			if (other.address != null) {
				return false;
			}
		} else if (!address.equals(other.address)) {
			return false;
		}
		if (age != other.age) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (primaryWork == null) {
			if (other.primaryWork != null) {
				return false;
			}
		} else if (!primaryWork.equals(other.primaryWork)) {
			return false;
		}
		return true;
	}
	

}
