package com.TestSuite;

import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ok extends TestListenerAdapter{
	

	@Test
	public void method() {
		System.out.println("Hello GITHUB");
	}
	
	@Test
	public void method1() {
		System.out.println("Hello World");
	}

    @Test
    public void method2(){
		System.out.println("Code From Visual Studio - Code Conflict");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@BeforeTest
	public void beforTest() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	
	@Test
	public void test1() {
		System.out.println("Test1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test2");
	}
	
	@Test
	public void test3() {
		System.out.println("From Eclipse");
	}
	
	@Test
	public void test4() {
		System.out.println("In Branch 1 code ");
	}

@Test
	public void test5() {
		System.out.println("VS code In Branch1");
	}

	@Test
	public void test6() {
		System.out.println("Branch1 - Edit from GITHUB Editor");
	}
}
