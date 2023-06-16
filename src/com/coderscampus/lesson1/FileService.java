package com.coderscampus.lesson1;

import java.io.File;
import java.io.IOException;

public interface FileService {
	
	// NOTE: 
	// Interfaces can not be instantiated.
	// You can instantiate the 'Impl' version of the Interface
	
	String standardFileName = "data.txt"; 
	
	// By default the methods below are 'public' and 'abstract'
	
	String readLine (File file) throws IOException;
	
	void writeLine(File file, String line) throws IOException;
	
	
	

}
