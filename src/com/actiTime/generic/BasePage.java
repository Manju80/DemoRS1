package com.actiTime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage 
{
	public WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;	
	}
	
	//to verify the title
	public void verifyTitle(String eTitle)
	{
			
		WebDriverWait wait = new WebDriverWait(driver, 20);
		try 
		{
		
		wait.until(ExpectedConditions.titleIs(eTitle));
		Reporter.log("Title is matching", true);
		}
		
		catch (Exception e)
		
		{
			
			Reporter.log("Title is not matching: expected title is "+eTitle, true);
			Reporter.log("Actual title is : "+driver.getTitle(), true);
		}
	}	
		
		//to verify the element
		public void verifyElement(WebElement element)
		{
			WebDriverWait wait=new WebDriverWait(driver, 20);
			try
			{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("element is present", true);
			}
			
			catch(Exception e)
			{
				Reporter.log("element is not present", true);	
			}
			
			
		}
	}
		
	