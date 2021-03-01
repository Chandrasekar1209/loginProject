package com.htc.testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.htc.pageObjects.BaseClass;
import com.htc.pageObjects.LoginPage;

public class Test_Account_LoginUserValid extends BaseClass {
private WebDriver driver;
	
//	UtilityClass util=new UtilityClass();
	//Properties properties=util.loadingProperties();
//	//ExtentReports extentReport;
////	ExtentTest testCase;
//	
	//String email=properties.getProperty("emailAddress");
//	String password=properties.getProperty("password");

	@Test()
	public void loginApp(){
		logger=report.createTest("Login to Madison");
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		logger.info("Starting Application");
		loginPage.loginSection("rajinistar7@gmail.com", "super@12345");
		logger.pass("Login successfull");
	//	loginPage.loginSection(excel.getStringData("Login", 0, 0),excel.getStringData("Login", 0, 1));
		
	}
	
	
	
	
	
//	@Test()
//	public void testLoginUser_checkValid() {
//		//testCase=extentReport.createTest("Verify firefox title");
//		driver=util.startBrowser();
//		System.out.println("driver"+driver);
//		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
//		Reporter.log("PageFactory  is loaded in loginpage", true);
//		loginPage.loginSection(email, password);
//		util.captureScreenShot();
//		
//
//	}
//	@Test()
//	public void testNavigatingToShirtSection() {
//		HomePage homePage=PageFactory.initElements(driver,HomePage.class);
//		Reporter.log("PageFactory  is loaded in homepage", true);
//		homePage.navigatingToMenShirt();
//		util.captureScreenShot();
//		util.tearDown();
//	}
	
//	@Test()
//	@Parameters({"emailAddress","passWord"})
//	public void testLoginUser_checkInValid(String emailAddress,String passWord ) {
//		//testCase=extentReport.createTest("Verify firefox title");
//		driver=util.startBrowser();
//		System.out.println("driver"+driver);
//		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
//		Reporter.log("PageFactory  is loaded", true);
//		loginPage.loginSection(emailAddress, passWord);
//		//util.tearDown();
//
//	}

}
