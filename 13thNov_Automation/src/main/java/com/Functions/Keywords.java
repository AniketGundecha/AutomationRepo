package com.Functions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;

public class Keywords extends ExtentReport{

	WebDriver driver;

	String projectPath = System.getProperty("user.dir");

	public void Click(WebDriver driver, String locator) {

		WebElement ele = driver.findElement(By.xpath(locator));
		ele.click();
	}

	public void SendKeys(WebDriver driver, String locator, String value) throws IOException {

		
			WebElement ele = driver.findElement(By.xpath(locator));
			ele.sendKeys(value);
	}

	public void GetURL(WebDriver driver, String value) {

		driver.get(value);
	}
	

	public void ImplicitWait(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void QuitBrowser(WebDriver driver) {

		driver.quit();

	}

	public String JsonReader(String key) throws FileNotFoundException, IOException, ParseException {

		String value = null;

		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader(projectPath + "\\config\\Data.json"));

		value = (String) jsonObject.get(key);
		return value;

	}
	
	public String Screenshot(WebDriver driver , String imgName) throws IOException {
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destination = projectPath+"\\screenShots" + imgName + ".png";
		FileUtils.copyFile(screenshotFile, new File(destination));
		
		return destination;
		
	}

}
