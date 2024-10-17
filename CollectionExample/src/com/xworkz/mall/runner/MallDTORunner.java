package com.xworkz.mall.runner;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.stream.Collectors;

import com.xworkz.mall.constant.Location;
import com.xworkz.mall.dto.MallDTO;

public class MallDTORunner {

	public static void main(String[] args) {
		LinkedList<MallDTO> mall = new LinkedList<MallDTO>();

		mall.add(new MallDTO(1, "Orion Mall", Location.BANGALORE, "John Doe", 2500.5));
		mall.add(new MallDTO(2, "Phoenix Marketcity", Location.BANGALORE, "Michael Smith", 5000.0));
		mall.add(new MallDTO(3, "Forum Mall", Location.MYSORE, "Alice Johnson", 125000.75));
		mall.add(new MallDTO(4, "Mantri Square", Location.BANGALORE, "Robert Williams", 4500.2));
		mall.add(new MallDTO(5, "VR Mall", Location.MANGALORE, "David Brown", 4000.9));
		mall.add(new MallDTO(6, "Gopalan Mall", Location.TUMKUR, "Karen Taylor", 100800.3));
		mall.add(new MallDTO(7, "Lulu Mall", Location.BANGALORE, "Daniel Jones", 7000.4));
		mall.add(new MallDTO(8, "Inorbit Mall", Location.MYSORE, "Sophia Wilson", 3500.6));
		mall.add(new MallDTO(9, "Mall of India", Location.MANGALORE, "Christopher Garcia", 6500.0));
		mall.add(new MallDTO(10, "Westend Mall", Location.TUMKUR, "Olivia Martinez", 2200.4));

		mall.forEach((ref) -> System.out.println(ref));
		System.out.println("==================================================================");

		System.out.println("Sort all mall by ID desc");
		mall.stream().sorted((ref1, ref2) -> Integer.compare(ref2.getId(), ref1.getId())).collect(Collectors.toList())
				.forEach((ref) -> System.out.println(ref));

		System.out.println("==================================================================");
		System.out.println(" Sort all mall name desc order");
		mall.stream().sorted((ref1, ref2) -> ref1.getName().compareTo(ref2.getName())).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));

		System.out.println("==================================================================");
		System.out.println("Filter all mall by landDimension less than one lakh");
		mall.stream().filter(ref -> ref.getLandDimension() < 100000).forEach((ref) -> System.out.println(ref));

		System.out.println("==================================================================");
		System.out.println(" Collect only names of mall");
		mall.stream().map(names -> names.getName()).forEach(ref -> System.out.println(ref));

		System.out.println("==================================================================");
		System.out.println("Collect only landDimension and sort it asc order");
		mall.stream().map(dimension -> dimension.getLandDimension()).sorted().forEach(ref -> System.out.println(ref));

		System.out.println("==================================================================");
		Iterator<MallDTO> itr = mall.iterator();
		while (itr.hasNext()) {
			MallDTO ref = itr.next();
			if (ref.getName().startsWith("M")) {
				// only remove can be performed in iterator
				// begins traversing from first element only
				itr.remove();
			} else
				System.out.println(ref);

		}

		System.out.println("===============================================================");

		ListIterator<MallDTO> listItr = mall.listIterator();
		while (listItr.hasNext()) {

			// both add and remove can be performed
			MallDTO ref = listItr.next();
			if (ref.getId() == 10)
				listItr.add(new MallDTO(11, "RMZ", Location.BANGALORE, "Michael ", 5000.0));

		}

		mall.forEach(ref -> System.out.println(ref));

		System.out.println("-----------------reverse---------------------");
		ListIterator<MallDTO> listItr1 = mall.listIterator(mall.size());
		while (listItr1.hasPrevious()) {

			MallDTO ref = listItr1.previous();
			System.out.println(ref);

		}

		System.out.println("-----------------starting from index 5 in reverse order--------------------");
		ListIterator<MallDTO> listItr2 = mall.listIterator(5);
		while (listItr2.hasPrevious()) {

			MallDTO ref = listItr2.previous();
			System.out.println(ref);

		}

		System.out.println("-----------------starting from index 5--------------------");
		ListIterator<MallDTO> listItr3 = mall.listIterator(5);
		while (listItr3.hasNext()) {

			MallDTO ref = listItr3.next();
			System.out.println(ref);

		}

	}

}
