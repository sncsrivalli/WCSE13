package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		//Create an instance of FileInputStream with properties file path
		FileInputStream fis = new FileInputStream("./data.properties");
		
		//Create an instance for Properties class
		Properties p = new Properties();
		
		//Load properties file to the project
		p.load(fis);
		
		//Fetch the data from properties file
		String url = p.getProperty("url");
		String username = p.getProperty("username");
		String password = p.getProperty("password");
		
		System.out.println(url+"\n"+username+"\n"+password);

	}

}
