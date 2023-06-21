package com.coderscampus.lesson7;

public class RegExApplication {

	public static void main(String[] args) {
		// valid: email address: fake.email@gmail.com
		// invalid email address: trevorcraftycodr.com  (missing the @ sign)
		// invalid email address: trevor@craftycodr.thisisntarealdomain (missing the com)
		// valid email address: trevor@craftycodr.com
		// valid email address: trevor-page.2@gmail.com
		// valid email address: Trevor@CraftyCodr.com
		
		
		inputMatchesRegExPattern("fake.email@gmail.com");
		inputMatchesRegExPattern("trevorcraftycodr.com");
		inputMatchesRegExPattern("trevor@craftycodr.thisisntarealdomain");
		inputMatchesRegExPattern("trevor@craftycodr.com");
		inputMatchesRegExPattern("trevor-page.2@gmail.com");
		inputMatchesRegExPattern("Trevor@CraftyCodr.com");
		
		
		

	}

	private static void inputMatchesRegExPattern(String input) {
		boolean matchFound = input.matches("^[A-Za-z0-9][A-Za-z0-9-]{0,}\\.?[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z]{1,5}$");
		System.out.println("For input " + input + ", matchFound = " + matchFound);
	}

}
