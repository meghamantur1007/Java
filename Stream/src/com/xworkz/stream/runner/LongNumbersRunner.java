package com.xworkz.stream.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class LongNumbersRunner {

	public static void main(String[] args) {

		Collection<Long> collection =new ArrayList<Long>();
		
		collection.add(9380916659L);
		collection.add(8431192590L);
		collection.add(9740212848L);
		collection.add(9986667354L);
		collection.add(9965624510L);
		collection.add(8565655565L);
		collection.add(6225370241L);
		collection.add(6363827480L);
		collection.add(9776768787L);
		collection.add(9901106971L);
		
		System.out.println("Before Sorting");
		collection.forEach(ref -> System.out.println("Mobile No: " + ref));

		// Ascending
		System.out.println("======Sorting in Ascending=========");
		collection.stream().sorted().collect(Collectors.toList()).forEach(ref1 -> System.out.println("Mobile No :" + ref1));

		// descending
		System.out.println("======Sorting in Descending=======");
		collection.stream().sorted((ref1, ref2) -> ref2.compare(ref2, ref1)).collect(Collectors.toList()).forEach(sorted -> System.out.println("Mobile No :" + sorted));
	}

}
