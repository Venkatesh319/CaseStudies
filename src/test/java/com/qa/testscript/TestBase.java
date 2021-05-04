package com.qa.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import com.qa.pages.NykaaPages;


public class TestBase {
	WebDriver driver;
	public 	NykaaPages NykaaOR;
	SoftAssert Sassert;
	@Parameters({"Browser","URL"})
	@BeforeClass
	public void setup(String Browser, String URL) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\web drivers\\\\chromedriver.exe");
		driver = new ChromeDriver();
		NykaaOR=new NykaaPages(driver);
		driver.get(URL);
		Sassert =new SoftAssert();

	}

	@AfterClass
	public void teardown() {
		driver.close();

	}


}
