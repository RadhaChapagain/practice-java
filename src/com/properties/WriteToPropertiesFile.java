package com.properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {

	public static void main(String[] args) throws IOException {
	
		//initiate the properties file
		
		Properties properties = new Properties();
		
		properties.put("username", "radha");
		properties.put("password", "abcd");
		
		FileOutputStream file = new FileOutputStream("properties\\writedata.properties", true);
		
		properties.store(file, "This is my property file");
		
		System.out.println("File created");

	}

}
