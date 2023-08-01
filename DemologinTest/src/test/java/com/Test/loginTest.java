package com.Test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.loginPage;

public class loginTest {
	
	WebDriver driver= null;
	@Test
	public void Test01() {
		System.setProperty("Webdriver.chrome.driver","H:/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("file:///C:/Users/PRITAM/Desktop/automation%20tols/Offline%20Website/index.html");
		
		loginPage lp= new loginPage(driver);
		lp.loginToApplication("kiran@gmail.com", "123456");
		
	}
	@Test
	public void Test02() {
		ArrayList<String>exepectedcourse = new ArrayList<String>();
		exepectedcourse.add("Selenium");
		exepectedcourse.add("Java / J2EE");
		exepectedcourse.add("Python");
		exepectedcourse.add("Php");
		DashboardPage dp = new DashboardPage(driver);
		ArrayList<String>actualcourses=dp.verifycourse();
		
		Assert.assertEquals(actualcourses, exepectedcourse);
		
	}
	

}
