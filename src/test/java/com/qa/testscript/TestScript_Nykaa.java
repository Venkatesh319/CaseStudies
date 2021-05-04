package com.qa.testscript;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.ExcelUtility;

public class TestScript_Nykaa extends TestBase {
	
	@Test
	public void LoginAccount() throws InterruptedException  {
		
		NykaaOR.getAccountLink().click();
		NykaaOR.getEnterPhoneNumber().click();
		Thread.sleep(1000);
		NykaaOR.getEmailMobile().sendKeys("Kinsmith@gmail.com");
		NykaaOR.getbtn_Proceed().click();
		Thread.sleep(1000);
		NykaaOR.getPassword().sendKeys("mercury");
		Thread.sleep(1000);
		NykaaOR.getLogin().click();
		Thread.sleep(1000);
		}
	
	@Test(dataProvider="getData")
	public void SearchBox(String Categories) throws Exception {
		
		NykaaOR.getSearchbtn().sendKeys(Categories);
		System.out.println("method called");
		Thread.sleep(1000);
		
		NykaaOR.getSearchbtn();
		System.out.println("Submitted");
		
		
		
		
				
	}
	
	@DataProvider
	public String [][] getData() throws IOException {
		
		String xlPath="C:\\Users\\Dell\\eclipse-virtusa\\SeleniumAutomation_CS\\src\\test\\java\\com\\qa\\testdata\\Untitled spreadsheet.xlsx";
		String xlSheet="Sheet1";
		 int rowCount=ExcelUtility.getRowCount(xlPath, xlSheet);
		 int cellCount=ExcelUtility.getCellCount(xlPath, xlSheet, rowCount);
		 
		 String [][] data=new String[rowCount][cellCount];
		 for(int i=1;i<=rowCount;i++) {
			 for(int j=0;j<cellCount;j++) {
				 data[i-1][j]=ExcelUtility.getCellData(xlPath, xlSheet, i, j);
			 }
		 }
		return data;
	}

}
