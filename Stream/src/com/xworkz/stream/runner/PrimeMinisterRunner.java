package com.xworkz.stream.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class PrimeMinisterRunner {

	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<String>();

		collection.add("Jawaharlal Nehru");
		collection.add("Lal Bahadur Shastri");
		collection.add("Indira Gandhi");
		collection.add("Rajiv Gandhi");
		collection.add("Vishwanath Pratap Singh");
		collection.add("Chandra Shekhar");
		collection.add("P. V. Narasimha Rao");
		collection.add("Atal Bihari Vajpayee");
		collection.add("H. D. Deve Gowda");
		collection.add("Manmohan Singh");
		collection.add("Narendra Modi");

		System.out.println("==========Before Sorting==========");
		collection.forEach(ref -> System.out.println("Prime Ministers: " + ref));
		
		//Ascending
		System.out.println("===========Sorting in Ascending==========");
		collection.stream().sorted().collect(Collectors.toList()).forEach(ref1->System.out.println(ref1));
		
		//Descending
		System.out.println("==========Sorting in Descending=========");
		collection.stream().sorted((ref1, ref2) -> ref2.compareTo(ref1)).collect(Collectors.toList()).forEach(ref1->System.out.println(ref1));
		
	}

}
