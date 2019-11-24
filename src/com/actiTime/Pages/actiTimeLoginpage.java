package com.actiTime.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiTime.generic.BasePage;

public class actiTimeLoginpage extends BasePage {
	
	//Declaration
	@FindBy(id="username")
	private WebElement untb;
	
	@FindBy(name="pwd")
	private WebElement pwtb;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgnbtn;
	
	@FindBy(xpath="//nobr[.='actiTIME 2019.3 Pro']")
	private WebElement version;
	
	@FindBy(xpath="//span[contains(.,'invalid')]")
	private WebElement errmsg;
	//Initialization
	public actiTimeLoginpage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
		
	//Utilization
		public void Enterusername(String un)
		{
			
			untb.sendKeys(un);
		}
		
		public void Enterpassword(String pw)
		{
			
			pwtb.sendKeys(pw);
		}
		
		public void clickOnLogin()
		{
			
			lgnbtn.click();
		}
		
		public void verifyTitle(String title)
		{
			verifyTitle(title);
		}
		
		public String verifyerrmsg()
		{
			verifyElement(errmsg);
			String aerrmsg=errmsg.getText();
			return aerrmsg;
			
		}
		
		public String verifyVersion()
		{
			
			verifyElement(version);
			String aversion = version.getText();
			return aversion;
		}	
		
}