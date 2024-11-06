package com.xworkz.map.runner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.xworkz.map.dto.AddressDTO;
import com.xworkz.map.dto.CountryDTO;
import com.xworkz.map.dto.PresidentDTO;

public class CountryRunner {

	public static void main(String[] args) {
		
		Map<CountryDTO,PresidentDTO> map=new HashMap<>();
		map.put(new CountryDTO("India", 91),new PresidentDTO("Droupadi Murmu", 65, "President of India", new AddressDTO(40, "New Delhi", "Delhi", "India", new CountryDTO("India",91))));
		map.put(new CountryDTO("United States", 1), new PresidentDTO("Joe Biden", 80, "President of the United States", new AddressDTO(56, "Pennsylvania Avenue NW", "Washington, D.C.", "United States", new CountryDTO("United States", 1))));
		map.put(new CountryDTO("France", 33), new PresidentDTO("Emmanuel Macron", 45, "President of France", new AddressDTO(78, "Rue du Faubourg Saint-Honoré", "Paris", "France", new CountryDTO("France", 33))));
		map.put(new CountryDTO("Japan", 81), new PresidentDTO("Fumio Kishida", 66, "Prime Minister of Japan", new AddressDTO(99, "Nagatachō", "Tokyo", "Japan", new CountryDTO("Japan", 81))));
		map.put(new CountryDTO("Brazil", 55), new PresidentDTO("Luiz Inácio Lula da Silva", 78, "President of Brazil", new AddressDTO(80, "Praça dos Três Poderes", "Brasília", "Brazil", new CountryDTO("Brazil", 55))));

		
		Set<CountryDTO> keys=map.keySet();
		keys.forEach(ref->System.out.println("keys:"+keys));
		
		System.out.println("===================================");
		
		Collection<PresidentDTO> values=map.values();
		values.forEach(ref->System.out.println("Values:"+values));
		
		System.out.println("===================================");
		Set<CountryDTO> entries=map.keySet();
		entries.forEach(ref->System.out.println("Entries:"+entries));
		
		
		
	}
	
}
