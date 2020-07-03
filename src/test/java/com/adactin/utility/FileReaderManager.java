package com.adactin.utility;

import java.io.IOException;

public class FileReaderManager {

	
	//private constructor will not allow object creation in any other places
	private FileReaderManager() {
	}

	//to get object object of this class ---- should be static
	public static FileReaderManager getInstance() {
		FileReaderManager f = new FileReaderManager();
		return f;
	}

	//to get object of the CofigurationReader class --- should be non-static
	public ConfigurationReader getCRInstance() throws IOException {
		ConfigurationReader cr = new ConfigurationReader();
		return cr;
	}

}
