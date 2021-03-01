package com.htc.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage  {

	private WebDriver  driver;
	public LoginPage(WebDriver  driver) {
		this.driver=driver;

	}

	@FindBy(xpath = "//p[@class='hello']/child::strong")
	private   WebElement myDashboard;
	@FindBy(xpath = "//*[@id=\"header\"]/div/div[2]/div/a")
	private  WebElement accountBtn;
	@FindBy(xpath = "//a[@title='Log In']")
	private  WebElement login;
	@FindBy(id = "email")
	private  WebElement emailaddress;
	@FindBy(id = "pass")
	private  WebElement password;
	@FindBy(id="send2")
	private  WebElement finalLoginBtn;

	//Methods
	public void clickAccount() {
		accountBtn.click();
		Reporter.log("Account button clicked in HomePage", true);
	}
	public void clickLogin() {
		Actions actions=new Actions(driver); 
		actions.moveToElement(login);
		actions.click().build().perform();
		login.click();
		Reporter.log("Login button clicked in LoginPage", true);
	}
	public void setEmailAddress(String email)
	{
		emailaddress.sendKeys(email);
		Reporter.log("Emailaddress is enter in email Box:"+email, true);
	}
	public void setPassword(String passWord)
	{
		password.sendKeys(passWord);
		Reporter.log("passWord is enter in passWord Box:"+passWord, true);
	}
	public void clickOnLoginButton()
	{
		finalLoginBtn.click();
		Reporter.log("Login button clicked in LoginPage", true);
	}

	//Business Methods
	public void loginSection(String email,String passWord ) {
		System.out.println(email);
		System.out.println(passWord);
		System.out.println("vankammmmmmmmmmmmmmm");
		//clickAccount();
		System.out.println("vandhanammm");
		//clickLogin();
		setEmailAddress(email);
		setPassword(passWord);
		clickOnLoginButton();
		String actual=driver.getTitle();
		String expected="My Account";
		Assert.assertEquals(actual, expected,"Not loged in,give a  correct details");
		Reporter.log("Able to login successfully", true);
		//homePage=new HomePage(driver);
		// return homePage;



	}


}
