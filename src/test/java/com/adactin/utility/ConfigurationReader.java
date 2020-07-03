package com.adactin.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ConfigurationReader {
	public static Properties p;
	
	public ConfigurationReader() throws IOException {
	File file = new File(".//src//test//java//com//adactin//properties//Adactin.properties");
	FileInputStream fis = new FileInputStream(file);
	p = new Properties();
	p.load(fis);
	}
	
	public String getTestDataPath() {
	String testData = p.getProperty("testData");
	return testData;
	}
	
	public String getBrowserName() {
	String browserName = p.getProperty("browserName");
	return browserName;
	}
	
	public String getUrlConfig() {
	String url = p.getProperty("url");
	return url;
	}
	
}
