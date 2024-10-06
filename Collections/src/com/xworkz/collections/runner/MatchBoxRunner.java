package com.xworkz.collections.runner;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.collections.DTO.MatchBoxDTO;

public class MatchBoxRunner {

	public static void main(String[] args) {

		MatchBoxDTO<Double, String> matchBox1 = new MatchBoxDTO<Double, String>(2.0, "Pushpa");
		MatchBoxDTO<Double, String> matchBox2 = new MatchBoxDTO<Double, String>(4.0, "Asia");
		MatchBoxDTO<Double, String> matchBox3 = new MatchBoxDTO<Double, String>(6.0, "Goodness");
		MatchBoxDTO<Double, String> matchBox4 = new MatchBoxDTO<Double, String>(3.0, "Saftey");
		MatchBoxDTO<Double, String> matchBox5 = new MatchBoxDTO<Double, String>(8.0, "Saijee");

		Collection<MatchBoxDTO> collection = new LinkedList<MatchBoxDTO>();
		collection.add(matchBox1);
		collection.add(matchBox2);
		collection.add(matchBox3);
		collection.add(matchBox4);
		collection.add(matchBox5);

		System.out.println("size is :" + collection.size());
		System.out.println("Is empty:" + collection.isEmpty());

		Iterator<MatchBoxDTO> iterator = collection.iterator();

		while (iterator.hasNext()) {
			MatchBoxDTO ref = iterator.next();
			System.out.println(ref);
		}
		/*collection.clear();
		System.out.println("after clear....");
		System.out.println("Is empty:" + collection.isEmpty());*/

	}

}
