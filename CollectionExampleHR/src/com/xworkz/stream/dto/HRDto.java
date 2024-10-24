package com.xworkz.stream.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
@EqualsAndHashCode
public class HRDto {
	
	private String name;
	private String qualification;
	private double totalExp;
	private String location;
	
}