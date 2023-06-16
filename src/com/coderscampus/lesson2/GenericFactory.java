package com.coderscampus.lesson2;

public abstract class GenericFactory {

	Integer totalCapacity;

	public abstract Product build(Part[] parts);

	public Integer getTotalCapacity() {
		return totalCapacity;
	}

}
