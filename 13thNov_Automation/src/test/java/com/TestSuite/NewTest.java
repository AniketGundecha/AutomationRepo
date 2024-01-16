package com.TestSuite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
  @Test
  public void f() {
	  
	  WebDriverManager.chromedriver().setup();
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.google.com/");
	  
	 List<WebElement> eles = driver.findElements(By.xpath("//div[@id='SIvCob']//a"));
	  
	  for(WebElement ele:eles) {
		  
		  if(ele.getText().equalsIgnoreCase("मराठी")) {
			  System.out.println("मराठी" + "------------------------------");
		  }
		  else {
			  System.out.println(ele.getText());		  }
	  }
	  
	  
  }
}
