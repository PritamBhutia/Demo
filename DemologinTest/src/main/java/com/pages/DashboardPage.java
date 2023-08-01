package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	WebDriver dpdriver= null;
	public DashboardPage( WebDriver driver) {
		this.dpdriver= driver;
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath="//h3")
	List<WebElement>courses;
	public ArrayList<String >verifycourse(){
		ArrayList<String>actualcourses= new ArrayList<String>();
		for(WebElement course: courses) {
			String text=course.getText();
			
			actualcourses.add(text);
			
			
		}
		return actualcourses;
	}
	
	
	

}
