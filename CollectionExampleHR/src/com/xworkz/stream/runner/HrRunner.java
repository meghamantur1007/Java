package com.xworkz.stream.runner;

import java.awt.List;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.stream.Collectors;

import com.xworkz.stream.dto.HRDto;

public class HrRunner {

	public static void main(String[] args) {

		Collection<HRDto> collection = new LinkedList<>();

		HRDto dto1 = new HRDto("Megha", "BE", 3, "Bangalore");
		HRDto dto2 = new HRDto("Deepa", "MBA", 4, "Kolkatta");
		HRDto dto3 = new HRDto("Soumya", "BBA", 5, "Belagavi");
		HRDto dto4 = new HRDto("Preeti", "Bcom", 6, "Mysore");
		HRDto dto5 = new HRDto("Shreya", "BSC", 7, "Mumbai");
		HRDto dto6 = new HRDto("Laxmi", "Btech", 8, "Hydrabad");
		HRDto dto7 = new HRDto("Ranjitha", "MBBS", 9, "Pune");
		HRDto dto8 = new HRDto("Amulya", "BA", 10, "Bijapur");
		HRDto dto9 = new HRDto("Pallavi", "MCA", 11, "Bangalore");
		HRDto dto10 = new HRDto("rashmi", "BCA", 12, "Huballi");

		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		collection.add(dto8);
		collection.add(dto9);
		collection.add(dto10);

		collection.stream().forEach(ref -> System.out.println(ref));

		System.out.println("====================================");
		System.out.println("All hr from a location");
		collection.stream().filter(hr -> hr.getLocation().equals("Bangalore")).forEach(ref -> System.out.println(ref));

		System.out.println("====================================");
		System.out.println("hr totalExp greater than 5");
		collection.stream().filter(hr -> hr.getTotalExp() > 5).forEach(ref -> System.out.println(ref));

		System.out.println("====================================");
		System.out.println(" hr name ending with r case in-sensitive");
		collection.stream().filter(hr -> hr.getName().endsWith("a")).forEach(ref -> System.out.println(ref));

		System.out.println("====================================");
		System.out.println("Only location");
		collection.stream().map(ref -> ref.getLocation()).forEach(ref -> System.out.println(ref));

		System.out.println("====================================");
		System.out.println("Only Names");
		collection.stream().map(ref -> ref.getName()).forEach(ref -> System.out.println(ref));

	
		System.out.println("====================================");
		System.out.println(" hr totalExp in desc ");
		collection.stream().sorted((ref1, ref2) -> Double.compare(ref2.getTotalExp(), ref1.getTotalExp()))
				.forEach(ref -> System.out.println(ref));

		System.out.println("====================================");
		System.out.println("Iterator to remove if hr name starts with A");

		Iterator<HRDto> iterator = collection.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getName().startsWith("A")) {
				iterator.remove();
			}
		}
		collection.forEach(ref->System.out.println(ref));

		System.out.println("====================================");
		System.out.println(" ListIterator to traverse in backward direction");

		LinkedList<HRDto> linkedList = new LinkedList<>(collection);
		ListIterator<HRDto> listIterator = linkedList.listIterator(linkedList.size());
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}
}