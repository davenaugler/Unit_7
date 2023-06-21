package com.coderscampus.lesson5;

import java.io.Serializable;

public class Person implements Comparable<Person>, Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private Integer height;
	
	public Person(String name, Integer height) {
		this.name = name;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	// This sort method sorts in Descending Order
	// For Ascending Order swap 'this' w/ 'that' and visa versa
	// on lines 35 and 37. Not on line 34.
	@Override
	public int compareTo(Person that) {
		if (this.height.compareTo(that.height) == 0) { // Primary sort
			return this.name.compareTo(that.name); // Secondary sort when Primary sort are equal or 0. This will sort names in Ascending order
		} else {
			return that.height.compareTo(this.height); // This will sort Height in Descending order
		}
	}
	
	// This is another way to solve the sorting problem,
	// but it's just more code 
//	@Override
//	public int compareTo(Person that) {
//		if (this.height > that.height) {
//			return -1;
//		} else if (this.height.equals(that.height)) {
//			return 0;
//		} else {
//			return 1;
//		}
//	}
	


}
