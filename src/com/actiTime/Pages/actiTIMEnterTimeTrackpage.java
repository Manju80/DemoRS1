package com.actiTime.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiTime.generic.BasePage;

public class actiTIMEnterTimeTrackpage extends BasePage 

{

	//Declaration
	@FindBy(id="logoutLink")
	private WebElement logoutbtn;
	//Initialization
	 public actiTIMEnterTimeTrackpage(WebDriver driver)
	 {
		super(driver);
		PageFactory.initElements(driver, this);
	 }
	 
	 //utilization
	 public void clickonLogout()
	 {
		 
		 logoutbtn.click();
	 }
	 
}
