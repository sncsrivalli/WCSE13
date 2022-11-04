package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataToPropertiesFile {

	public static void main(String[] args) throws IOException {
		//Step 1: Conversion of physical file into java readable object
		FileInputStream fis = new FileInputStream("./data.properties");
		
		//Step 2: Create an instance for Properties class
		Properties p = new Properties();
		
		//Step 3: Load the file to project
		p.load(fis);
		
		//Step 4: Write data into properties file
		p.put("url1", "https://www.google.co.in/");
		
		//Step 5: Save the data to properties file
		// Create an instance of FileOutputStream
		
		FileOutputStream fos = new FileOutputStream("./data.properties");
		
		// save data
		p.store(fos, "Data updated successfully");
		

	}

}
