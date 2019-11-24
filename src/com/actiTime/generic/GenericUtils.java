package com.actiTime.generic;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils {

	
	public static void getScreenshot(WebDriver driver, String name)
	{
		
		try
		{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/"+name+".png");
		
		}
		
		catch(Exception e)
		{
			
		}
		
	}	
		
		
public static void SelectByIndex(WebElement ele, int index)
{
	
	Select sel=new Select(ele);	
	sel.selectByIndex(index);
}

public static void SelectByValue(WebElement ele, String value)
{
	Select sel= new Select(ele);
	sel.selectByValue(value);
}
	
public static void SelectByText(WebElement ele, String text) 
	{		
		Select sel =new Select(ele);
		sel.selectByVisibleText(text);
			
	}
}


	