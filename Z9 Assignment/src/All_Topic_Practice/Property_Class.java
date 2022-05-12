package All_Topic_Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Property_Class {

	public static void main(String[] args) throws IOException {

		String currentWorkingDir = System.getProperty("user.dir");
		System.out.println(currentWorkingDir);

		String filePath = currentWorkingDir + "\\src\\All_Topic_Practice\\config.properties";
		System.out.println(filePath);
		
		// get file location --->create an instance of FileInputStream class and,
		// pass the file location to its constructor

		FileInputStream fis = new FileInputStream(filePath);
		// Create an instance of Properties class
		Properties prop = new Properties();
		// load property using load method Properties class
		prop.load(fis);
		// read data from property file
		System.out.println(prop.getProperty("applicationUrl"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("pinCode"));
		System.out.println(prop.getProperty("mobile"));

		FileOutputStream fos = new FileOutputStream(filePath);
	}
}
