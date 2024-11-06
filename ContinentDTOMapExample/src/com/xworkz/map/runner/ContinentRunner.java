package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

import com.xworkz.map.dto.ContinentDTO;
import com.xworkz.map.dto.CountryDTO;

public class ContinentRunner {

    public static void main(String[] args) {
        List<CountryDTO> list = new LinkedList<>();
        list.add(new CountryDTO("India", 91));
        list.add(new CountryDTO("Brazil", 1));
        list.add(new CountryDTO("Canada", 33));
        list.add(new CountryDTO("Finland", 81));
        list.add(new CountryDTO("Egypt", 55));

        Map<ContinentDTO,List<CountryDTO>> map=new HashMap<>();
        map.put(new ContinentDTO("Asia",1), list.subList(0, 1));
        map.put(new ContinentDTO("South America",2), list.subList(1, 2));
        map.put(new ContinentDTO("North America",3), list.subList(2, 3));
        map.put(new ContinentDTO("Europe",4), list.subList(3, 4));
        map.put(new ContinentDTO("Africa",5), list.subList(4, 5));

        Set<ContinentDTO> keys = map.keySet();
        keys.forEach(ref->System.out.println("Keys"+keys));
        
        System.out.println("-------------------------------------");

        Collection<List<CountryDTO>> values = map.values();
        values.forEach(ref->System.out.println("Keys"+values));

        System.out.println("-------------------------------------");

        Set<Map.Entry<ContinentDTO, List<CountryDTO>>> entries = map.entrySet();
        entries.forEach((ref) -> System.out.println(ref));
    }
}
