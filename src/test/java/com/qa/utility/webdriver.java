package com.qa.utility;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdriver {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\web drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Dell\\web drivers\\msedgedriver.exe");
		EdgeDriver Edriver=new EdgeDriver();
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\web drivers\\chromedriver.exe");
		//FirefoxDriver firefoxdriver=new FirefoxDriver();
		
	}

}
