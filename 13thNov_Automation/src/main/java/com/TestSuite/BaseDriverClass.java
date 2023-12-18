package com.TestSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.Functions.ExtentReport;
import com.Functions.Keywords;

public class BaseDriverClass{

	Keywords keyWord = new  Keywords();
	WebDriver driver;
	ChromeOptions options = new ChromeOptions();
	
	@BeforeMethod
	public void initialiseDriver() throws InterruptedException {
		System.out.println("Browser Start");
		Thread.sleep(4000);
		driver = new ChromeDriver(options);
		System.out.println("Browser End");
		//driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void QuitBrowser() {
		System.out.println("Quit start");
		driver.close();
		System.out.println("Quit End");
	}

	
}
