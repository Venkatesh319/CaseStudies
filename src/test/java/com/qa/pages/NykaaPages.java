package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NykaaPages {
	
	WebDriver driver;
	
	@FindBy(xpath="//span[contains(text(),'Account')]")
	WebElement AccountLink;
	
	public WebElement getAccountLink() {
		return AccountLink;
		
	}
	

	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement EnterPhoneNumber;
	
	public WebElement getEnterPhoneNumber() {
		return EnterPhoneNumber;
		
	}
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/form[1]/div[1]/input[1]\r\n")
	WebElement EmailMobile;
	
	public WebElement getEmailMobile() {
		return EmailMobile;
			
	}
	
	@FindBy(xpath="//button[contains(text(),'proceed')]")
	WebElement ProceedBtn;
	
	public WebElement getbtn_Proceed() {
		return ProceedBtn;
	}
	
	@FindBy(xpath="//input[@id='userName']")
	WebElement UName;
	
	public WebElement getUname() {
		return UName;
	}
	
	@FindBy(xpath="//input[@id='secure-input']")
	WebElement Password;
	
	public WebElement getPassword() {
		return Password;
	}
	
	@FindBy(xpath="//button[contains(text(),'register')]")
	WebElement Register;
	
	public WebElement getRegister() {
		return Register;
	}
	
	@FindBy(xpath="//button[contains(text(),'login')]")
	WebElement Login;
	
	public WebElement getLogin() {
		return Login;
		
	}
	
	@FindBy(xpath="//button[contains(text(),'Logout')]")
	WebElement Logout;
	
	public WebElement getLogout() {
		return Logout;
	}
	
	
	@FindBy(xpath="//*[@id=\"headerMenu\"]/div[3]/div/div/form/input")
	WebElement Searchbtn;
	
	public WebElement getSearchbtn() {
		return Searchbtn;
	}
	
	@FindAll(@FindBy(tagName="name=\"search-suggestions-nykaa\""))
	List<WebElement> Suggestions;

	public List<WebElement> Suggestions() {
		// TODO Auto-generated method stub
		return Suggestions;
	}
	
	
			
	
	public NykaaPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
