package com.htc.utility;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {
	
	


	public static  void captureScreenShot(WebDriver driver) {
		try {
			
			TakesScreenshot screenShot=(TakesScreenshot)driver;
			File source=screenShot.getScreenshotAs(OutputType.FILE);
			Date date = new Date();
			String screenshotName = date.toString().replace(":", "_").replace(" ", "_") ;
			FileUtils.copyFile(source, new File("C:\\Users\\Happy\\Desktop\\UnitTesting\\r\\SeleniumAcademyPOM\\src\\test\\resources\\ScreenShotImg\\LoginImg"+screenshotName+".png"));
			System.out.println("screenShot is captured");
		} catch (Exception e) {
			System.out.println("Exception while taking Screenshot"+e.getMessage());
		}

		
//		public static String getCurrentDateTime() {
//			DateFormat customFormat=new 
//			
//		}

		
		
		
		
		
	}

	







}
