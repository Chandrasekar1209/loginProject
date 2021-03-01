package com.htc.pageObjects;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.htc.utility.BrowserFactory;
import com.htc.utility.ConfigDataProvider;
import com.htc.utility.ExcelDataProvider;
import com.htc.utility.Helper;

public class BaseClass {

	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	public ExtentReports report;
	public ExtentTest logger;
	
	@BeforeSuite
	public void setupSuite() {
		 excel=new ExcelDataProvider();
		 config=new ConfigDataProvider();
		 
		 ExtentHtmlReporter htmlReport=new ExtentHtmlReporter(new File("C:\\Users\\Happy\\Desktop\\UnitTesting\\r\\SeleniumAcademyPOM\\src\\test\\resources\\ExtentReport\\madison.html"));
		 report=new ExtentReports();
		 report.attachReporter(htmlReport);
	
	}
	
	
	@BeforeClass
	public void setup() {
		driver=BrowserFactory.startApplication(driver,config.getStagingURL(),config.getBrowser(),config.getDriverLocatioin());
	}
	@AfterClass
	public void tearDown() {
		BrowserFactory.quitBrowser(driver);
	}
	@AfterMethod
	public void tearDownMethod(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Helper.captureScreenShot(driver);
		}
	report.flush();
	}
	
	
	
	
}
