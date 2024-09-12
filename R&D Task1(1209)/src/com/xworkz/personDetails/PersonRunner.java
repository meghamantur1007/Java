package com.xworkz.personDetails;

public class PersonRunner {

	public static void main(String[] args) {
		Person person1 = new Person("Megha", "meghamantur@gmail.com", 22, "9380916659");
		Person person2 = new Person("Nayana", "nayanakj@gmail.com", 23, "9834672587");
		Person person3 = new Person("Divya", "divyabgm@gmail.com", 23, "8452625263");
		Person person4 = new Person("Gunashree", "gunashreeB@gmail.com", 21, "7634576786");
		Person person5 = new Person("Laxmi", "laxmibgm@gmail.com", 22, "9576843683");

		Person[] persons = { person1, person2, person3, person4, person5 };

		for (Person person : persons) {
			person.printDetails();
		}
	}

}
