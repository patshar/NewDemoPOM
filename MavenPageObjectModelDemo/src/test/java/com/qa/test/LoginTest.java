package com.qa.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	//com.qa.utils u=new com.qaWebDriverWait wait;.test.();
	
	com.qa.pages.HomePage h=new com.qa.pages.HomePage();
	com.qa.pages.LoginPage l=new com.qa.pages.LoginPage();
	com.qa.libs.TestWebPage w=new com.qa.libs.TestWebPage();
	     
@BeforeTest
public void browserPage() {
	w.OpenWeb();
	h.OpenBrowser();
}
@Test
public void Test_1() {
	System.out.println("Test 1");
	l.Login();
	//login
}
	
		
	@Test
	public void Test_2() {
		System.out.println("Test 2");
		
	}
	
}
