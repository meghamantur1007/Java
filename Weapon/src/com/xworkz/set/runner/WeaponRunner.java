package com.xworkz.set.runner;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import com.xworkz.set.dto.WeaponDTO;

public class WeaponRunner {

	public static void findById(Set<WeaponDTO> set, int id) {
		Optional<WeaponDTO> wp = set.stream().filter(ref -> ref.getId() == id).findFirst();

		if (wp.isPresent()) {
			System.out.println("present");
			System.out.println(wp.get());
		}
	}

	public static void main(String[] args) {

		Set<WeaponDTO> weaponSet = new HashSet<WeaponDTO>();

		weaponSet.add(new WeaponDTO(1, "AK47", "Russia", LocalDate.of(2025, 05, 12)));
		weaponSet.add(new WeaponDTO(2, "M16", "United States", LocalDate.of(2024, 8, 1)));
		weaponSet.add(new WeaponDTO(3, "FAMAS", "France", LocalDate.of(2023, 6, 25)));
		weaponSet.add(new WeaponDTO(4, "L85", "United Kingdom", LocalDate.of(2026, 4, 15)));
		weaponSet.add(new WeaponDTO(5, "Galil", "Israel", LocalDate.of(2022, 10, 10)));
		weaponSet.add(new WeaponDTO(6, "QBZ-95", "China", LocalDate.of(2027, 11, 5)));
		weaponSet.add(new WeaponDTO(7, "Vektor R4", "South Africa", LocalDate.of(2028, 7, 20)));
		weaponSet.add(new WeaponDTO(8, "FN SCAR", "Belgium", LocalDate.of(2021, 3, 18)));
		weaponSet.add(new WeaponDTO(9, "Beretta ARX160", "Italy", LocalDate.of(2029, 12, 30)));
		weaponSet.add(new WeaponDTO(10, "Steyr AUG", "Austria", LocalDate.of(2030, 4, 15)));

		System.out.println("size:" + weaponSet.size());
		System.out.println("==========================");

		weaponSet.stream().filter(ref -> ref.getManfDate().getYear() > 2024).forEach(ref -> System.out.println(ref));
		System.out.println("==========================");

		weaponSet.stream().filter(ref -> ref.getManfDate().getYear() < 2024).forEach(ref -> System.out.println(ref));
		System.out.println("==========================");

		weaponSet.stream().sorted((ref1, ref2) -> Integer.compare(ref2.getId(), ref1.getId()))
				.forEach(ref -> System.out.println(ref));
		System.out.println("==========================");

		WeaponRunner.findById(weaponSet, 4);
	}

}
