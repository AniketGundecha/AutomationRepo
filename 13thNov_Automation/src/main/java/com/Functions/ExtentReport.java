package com.Functions;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {

 	
	static ExtentReports report;
	String projectPath;
	String extentReportPath;

	public void initializeReport() {

		
		Date date = new Date();
		SimpleDateFormat Dateformat = new SimpleDateFormat("MM_dd_yyyy-h_mm_ss");
		String timeStamp = Dateformat.format(date);

		 projectPath = System.getProperty("user.dir");
		extentReportPath = projectPath + "\\Reports\\" + timeStamp + ".html";
		report = new ExtentReports(extentReportPath, true);

	}

	public ExtentTest startParentTest(String testName) {

		ExtentTest parent = report.startTest(testName);
		report.flush();
		return parent;
	}

	public ExtentTest startChildTest(String testName) {

		ExtentTest child = report.startTest(testName);
		report.flush();
		return child;
	}

	public void passChild(String message, ExtentTest child) {

		child.log(LogStatus.PASS, message);
		report.flush();
	}

	public void failChild(String message, ExtentTest child , String ScreenShotPath) {
		
		String img =child.addScreenCapture(ScreenShotPath);
		child.log(LogStatus.FAIL, message + img);
		report.flush();
	}

	public void endChildTest(ExtentTest child) {
		report.endTest(child);
		report.flush();
	}

	public void endParentTest(ExtentTest parent) {
		report.endTest(parent);
		report.flush();
	}

	public void appendChildToParent(ExtentTest parent , ExtentTest child) {
		parent.appendChild(child);
		report.flush();
	}
	
	
	
	
}
