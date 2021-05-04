package com.qa.utility;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends TestListenerAdapter {


	public ExtentHtmlReporter htmlReporter;
	public ExtentReports exTent;
	public ExtentTest	exTest;


	public void onStart(ITestContext testContext) {

		String timeStamp=new SimpleDateFormat("yyy.MM.DD.HH.mm.ss").format(new Date());
		String repName = "Test-Report"+timeStamp+".html"; 

		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/Reports/"+repName); //i want to capture results to my particular Report Folder
		htmlReporter.config().setDocumentTitle("Automation Testing");
		htmlReporter.config().setReportName("Functional Testing");
		htmlReporter.config().setTheme(Theme.DARK);

		exTent= new ExtentReports();
		exTent.attachReporter(htmlReporter);
		exTent.setSystemInfo("Host Name", "localhost");
		exTent.setSystemInfo("QA Name", "Venkatesh");
		exTent.setSystemInfo("OS", "Windows ");
	}


	public void onFinish(ITestContext testContext) {

		exTent.flush();

	}


	public void onTestSuccess(ITestResult tr) {
		exTest=exTent.createTest(tr.getName());
		exTest.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
		exTest.log(Status.PASS,"Test is Passed");

	}


	public void onTestFailure(ITestResult tr) {

		exTest=exTent.createTest(tr.getName());
		exTest.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
		exTest.log(Status.FAIL,"Test is Failed");

	}


	public void onTestSkipped(ITestResult tr) {

		exTest=exTent.createTest(tr.getName());
		exTest.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.AMBER));
		exTest.log(Status.SKIP,"Test is Skipped");

	}

}
