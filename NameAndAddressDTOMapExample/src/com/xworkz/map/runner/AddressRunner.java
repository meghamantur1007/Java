package com.xworkz.map.runner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.xworkz.map.dto.AddressDTO;
import com.xworkz.map.dto.CountryDTO;

public class AddressRunner {

	public static void main(String[] args) {

		CountryDTO countryDto=new CountryDTO("India", 91);


		Map<String,AddressDTO> map=new HashMap<>();
		
		map.put("Megha", new AddressDTO(560010, "Rajajinagar", "Bangalore", "Karnataka", countryDto));
		map.put("Preeti", new AddressDTO(560043, "Kalyan Nagar", "Bangalore", "Karnataka", countryDto));
		map.put("Soumya", new AddressDTO(570016, "Hebbal", "Mysore", "Karnataka", countryDto));

		Set<String> keys=map.keySet();
		keys.forEach(ref->System.out.println("Keys:"+keys));
		
		System.out.println("=======================================");
		
		Collection<AddressDTO> values=map.values();
		values.forEach(ref->System.out.println("values"+values));
		
		System.out.println("==========================================");
		
		Set<Map.Entry<String, AddressDTO>> entries=map.entrySet();
		entries.forEach(ref->System.out.println("entries"+entries));
	}

}
