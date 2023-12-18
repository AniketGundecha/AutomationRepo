package com.TestSuite;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.Functions.Keywords;
import com.ObjRepository.ObjectRepo;

public class TestCases extends BaseDriverClass{

	Keywords keyWord = new Keywords();
	ObjectRepo objects = new ObjectRepo();
	
	
	
	@Test
	public void login() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		
		
		
		
		System.out.println("Login Start");
		String URL = keyWord.JsonReader("URL");
        keyWord.GetURL(driver,URL);
        
		keyWord.ImplicitWait(driver); 
		
		String UserName = keyWord.JsonReader("Username");
		keyWord.SendKeys(driver,objects.EnterUserName,UserName);
		
		String PassWord = keyWord.JsonReader("Password");
		keyWord.SendKeys(driver,objects.EnterPassword, PassWord);
		
		keyWord.Click(driver,objects.LoginButton);
		keyWord.ImplicitWait(driver);
		
		System.out.println("Login End");
		
	}
		
	@Test
	public void AddText() throws InterruptedException, FileNotFoundException, IOException, ParseException {

		System.out.println("AddText Start");
		String URL = keyWord.JsonReader("URL");
        keyWord.GetURL(driver,URL);
        
		keyWord.ImplicitWait(driver); 
		
		String UserName = keyWord.JsonReader("Username");
		keyWord.SendKeys(driver,objects.EnterUserName,UserName);
		
		String PassWord = keyWord.JsonReader("Password");
		keyWord.SendKeys(driver,objects.EnterPassword, PassWord);
		
		keyWord.Click(driver,objects.LoginButton);
		keyWord.ImplicitWait(driver);
		
		keyWord.Click(driver,objects.Admin);
		keyWord.Click(driver,objects.AddButton);
		
		keyWord.ImplicitWait(driver);
		System.out.println("AddText End");
		
	   }
	
	
	 
	}
	
