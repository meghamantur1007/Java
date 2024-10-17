package com.xworkz.mall.dto;

import com.xworkz.mall.constant.Location;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MallDTO {
	private int id;
	private String name;
	private Location location;
	private String owner;
	private double landDimension;

}
