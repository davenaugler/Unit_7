package com.coderscampus.lesson5;

import java.util.Arrays;

public class SortingApplication {

	public static void main(String[] args) {
		
		String[] names = new String[4];
		
		names[0] = "Dave Naugler";
		names[1] = "Allie Naugler";
		names[2] = "Addison Naugler";
		names[3] = "Trevor Page";
		
		System.out.println("PRE-SORTING");
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println("---------------");
		
		System.out.println("POST-SORTING");
		Arrays.sort(names);
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println("---------------");
		
		Person[] people = new Person[5];
		people[0] = new Person("Dave Naugler - 68", 68);
		people[1] = new Person("Allie Naugler - 68", 68);
		people[2] = new Person("Addison Naugler - 24", 24);
		people[3] = new Person("Trevor Page - 70", 70);
		people[4] = new Person("Jane Doe - 70", 70);
		
		Arrays.sort(people);
		
		for (Person person : people) {
			System.out.println(person.getName());
			
		}
		
		
		
	}

}
