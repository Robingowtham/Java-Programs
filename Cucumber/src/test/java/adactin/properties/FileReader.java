package adactin.properties;

import java.io.IOException;

public class FileReader {

	private FileReader() {
		// TODO Auto-generated constructor stub
	}
	
	public static FileReader readBrowser() {

		FileReader reader=new FileReader();
		
		return reader;		
	}
	
	public ConfigurationReader confirmThis() throws IOException {

		ConfigurationReader confirm=new ConfigurationReader();
		
		return confirm;
	}
	
}
