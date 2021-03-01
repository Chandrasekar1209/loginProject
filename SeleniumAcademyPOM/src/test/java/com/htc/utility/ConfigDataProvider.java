package com.htc.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	Properties properties;
	public ConfigDataProvider() {
		File source=new File("C:\\Users\\Happy\\Desktop\\UnitTesting\\r\\SeleniumAcademyPOM\\src\\test\\resources\\config.properties");
		try {
			FileInputStream fileInputStream=new FileInputStream(source);
			properties=new Properties();
			properties.load(fileInputStream);
		} catch (Exception e) {
			System.out.println("Not able to load config file "+e.getMessage());
		}
	}
	
	public String getDataFromConfig(String keyToSearch) {
		return properties.getProperty(keyToSearch);
	}
	
	public String getBrowser() {
		return properties.getProperty("browser");
	}
	
	public String getStagingURL() {
		return properties.getProperty("url");
	}
	
	public String getDriverLocatioin() {
		return properties.getProperty("driverLocation");
	}
	
}
