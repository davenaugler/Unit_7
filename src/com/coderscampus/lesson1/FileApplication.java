package com.coderscampus.lesson1;

public class FileApplication {

	public static void main(String[] args) {
		
		// Interfaces can not be instantiated.
		// You can instantiate the 'Impl' version of the Interface
		
		FileService fileService = new FileServiceImpl();

	}

}
