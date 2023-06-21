package com.coderscampus.lesson9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.coderscampus.lesson5.Person;

public class SerializableApplication {

	public static void main(String[] args) throws IOException {

//		savePeopleToFile();
		loadPeopleFromFile();

	}
	
	private static void loadPeopleFromFile() {
		
	}

	private static void savePeopleToFile() throws IOException, FileNotFoundException {
		Person dave = new Person("Dave Naugler", 68);
		Person janeDoe = new Person("Jane Doe", 65);
		Person elonMusk = new Person("Elon Musk", 75);

		try (FileOutputStream fileOutput = new FileOutputStream("people.txt");
				ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)) {
			objectOutput.writeObject(dave);
			objectOutput.writeObject(janeDoe);
			objectOutput.writeObject(elonMusk);
		}
	}

}
